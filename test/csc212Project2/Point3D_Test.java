package csc212Project2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Point3D_Test {

	@Test
	public void testUserSet() {
		System.out.println("Enter 1,1,1 to test the point.");
		Point3D p = new Point3D(0.0, 0.0, 0.0);
		double[] a = new double[3];
		p.userSet("initial point");
		a = p.get();
		assertEquals(1.0, a[0], 0.01);
		assertEquals(1.0, a[1], 0.01);
		assertEquals(1.0, a[2], 0.01);
	}

	@Test
	public void testPoint3D() {
		Point3D p = new Point3D(0.0, 0.0, 0.0);
		double[] a = new double[3];
		a = p.get();
		assertEquals(0.0, a[0], 0.01);
		assertEquals(0.0, a[1], 0.01);
		assertEquals(0.0, a[2], 0.01);
	}

	@Test
	public void testToString() {
		Point3D p = new Point3D(0.0, 0.0, 0.0);
		assertEquals("(0.0, 0.0, 0.0)\n", p.toString());
	}

	@Test
	public void testSetDoubleDoubleDouble() {
		Point3D p = new Point3D(0.0, 0.0, 0.0);
		double[] a = new double[3];
		p.set(1.0, 1.0, 1.0);
		a = p.get();
		assertEquals(1.0, a[0], 0.01);
		assertEquals(1.0, a[1], 0.01);
		assertEquals(1.0, a[2], 0.01);
	}

}
