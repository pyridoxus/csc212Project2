package csc212Project2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Matrix3D_Test {

	@Test
	public void testTranslate() {
		Point p = new Point3D(0.0, 0.0, 0.0);
		Point t = new Point3D(1.0, 1.0, 1.0);
		Matrix3D m = new Matrix3D();
		System.out.println(t);
		m.translate(p, t);
		System.out.println(m);
		System.out.println(p);
		assertEquals("(1.0, 1.0, 1.0)\n", p.toString());
	}

	@Test
	public void testScale() {
		Point p = new Point3D(1.0, 1.0, 1.0);
		Point s = new Point3D(2.0, 2.0, 2.0);
		Matrix m = new Matrix3D();
		m.scale(p, s);
		assertEquals("(2.0, 2.0, 2.0)\n", p.toString());
	}

	@Test
	public void testRotx() {
		Point p = new Point3D(0.0, 1.0, 0.0);
		Matrix m = new Matrix3D();
		double[] a = new double[3];
		m.rotx(p, m.degToRad(90));
		a = p.get();
		assertEquals(0.0, a[0], 0.01);
		assertEquals(0.0, a[1], 0.01);
		assertEquals(1.0, a[2], 0.01);
	}

	@Test
	public void testRoty() {
		Point p = new Point3D(0.0, 0.0, 1.0);
		Matrix m = new Matrix3D();
		double[] a = new double[3];
		m.roty(p, m.degToRad(90));
		a = p.get();
		assertEquals(1.0, a[0], 0.01);
		assertEquals(0.0, a[1], 0.01);
		assertEquals(0.0, a[2], 0.01);
	}

	@Test
	public void testRotz() {
		Point p = new Point3D(1.0, 0.0, 0.0);
		Matrix m = new Matrix3D();
		double[] a = new double[3];
		m.rotz(p, m.degToRad(90));
		a = p.get();
		assertEquals(0.0, a[0], 0.01);
		assertEquals(1.0, a[1], 0.01);
		assertEquals(0.0, a[2], 0.01);
	}

	@Test
	public void testMultiplyMatrix() {
		Matrix m = new Matrix3D();
		Matrix n = new Matrix3D();
		int a, b;
		m.multiply(n);
		for(a = 0; a < m.getSize(); a++)
		{
			for(b = 0; b < m.getSize(); b++)
			{
				if(a == b) assertEquals(1.0, m.get(a, b), 0.01);
				else assertEquals(0.0, m.get(a, b), 0.01);
			}
		}
	}

	@Test
	public void testMatrix3D() {
		Matrix m = new Matrix3D();
		String s = new String();
		int a = m.getSize();
		s = m.toString();
		assertEquals(4, a);
		assertEquals("1.0 0.0 0.0 0.0\n0.0 1.0 0.0 0.0\n0.0 0.0 1.0 0.0\n0.0 0.0 0.0 1.0\n", s);
	}

}
