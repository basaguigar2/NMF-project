package operations;

public class Fractions {
	Matrix m = new Matrix();

	public double[][] w_fraction(double[][] x, double[][] h, double[][] w) {
		double[][] c = new double[w.length][w[0].length];
		double[][] result1 = m.multiply(x, m.traspose(h));
		double[][] result2 = m.multiply(w, h);
		double[][] result3 = m.multiply(result2, m.traspose(h));
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				double resultf = result1[i][j] / result3[i][j];
				c[i][j] = w[i][j] * resultf;
			}
		}
		if(!m.tol(c,w)) {
			return w_fraction(x, h, c);	
		}else {
			return c;
		}
	}

	public double[][] h_fraction(double[][] x, double[][] h, double[][] w) {
		double[][] c = new double[h.length][h[0].length];
		double[][] result1 = m.multiply(m.traspose(w), x);
		double[][] result2 = m.multiply(m.traspose(w), w);
		double[][] result3 = m.multiply(result2, h);
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				double resultf = result1[i][j] / result3[i][j];
				c[i][j] = h[i][j] * resultf;
			}
		}
		if(!m.tol(c,h)) {
			return h_fraction(x, c, w);	
		}else {
			return c;
		}
	}
}
