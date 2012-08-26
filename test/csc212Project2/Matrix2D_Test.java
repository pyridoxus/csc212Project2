package csc212Project2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Matrix2D_Test {

	@Test
	public void testTranslate() {
		Point p = new Point2D(0.0, 0.0);
		Point t = new Point2D(1.0, 1.0);
		Matrix m = new Matrix2D();
		System.out.println(t);
		m.translate(p, t);
		System.out.println(m);
		System.out.println(p);
		assertEquals("(1.0, 1.0)\n", p.toString());
	}

	@Test
	public void testScale() {
		Point p = new Point2D(1.0, 1.0);
		Point s = new Point2D(2.0, 2.0);
		Matrix m = new Matrix2D();
		m.scale(p, s);
		assertEquals("(2.0, 2.0)\n", p.toString());
	}

	@Test
	public void testRotz() {
		Point p = new Point2D(1.0, 0.0);
		Matrix m = new Matrix2D();
		double[] a = new double[2];
		m.rotz(p, m.degToRad(90));
		a = p.get();
		assertEquals(0.0, a[0], 0.01);
		assertEquals(1.0, a[1], 0.01);
	}

	@Test
	public void testMultiplyMatrix() {
		Matrix m = new Matrix2D();
		Matrix n = new Matrix2D();
		m.multiply(n);
		assertEquals(1.0, m.get(0, 0), 0.01);
		assertEquals(1.0, m.get(1, 1), 0.01);
		assertEquals(1.0, m.get(2, 2), 0.01);
	}

	@Test
	public void testMatrix2D() {
		Matrix m = new Matrix2D();
		String s = new String();
		int a = m.getSize();
		s = m.toString();
		assertEquals(3, a);
		assertEquals("1.0 0.0 0.0\n0.0 1.0 0.0\n0.0 0.0 1.0\n", s);
	}

}
