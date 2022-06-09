package operations;

public class Matrix {
	public double[][] traspose(double[][] ds) {
		double matrixT[][] = new double[ds[0].length][ds.length];
		for (int x = 0; x < ds.length; x++) {
			for (int y = 0; y < ds[x].length; y++) {
				matrixT[y][x] = ds[x][y];
			}
		}
		return matrixT;
	}
	public void printMatriz(double[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}

			System.out.println();
		}
	}

	public double[][] multiply(double[][] matrix1, double[][] matrix2) {
		double[][] result = new double[matrix1.length][matrix2[0].length];
		if (matrix1[0].length == matrix2.length) {
			for (int i = 0; i < matrix1.length; i++) {
				for (int j = 0; j < matrix2[0].length; j++) {
					for (int k = 0; k < matrix1[0].length; k++) {
						result[i][j] += matrix1[i][k] * matrix2[k][j];
					}
				}
			}
		}
		return result;
	}

	public double[][] subtraction(double[][] matrix1, double[][] matrix2) {
		double[][] result = new double[matrix1.length][matrix1[0].length];
		for (int x = 0; x < result.length; x++) {
			for (int y = 0; y < result[x].length; y++) {
				result[x][y] = matrix1[x][y] - matrix2[x][y];
			}
		}
		return result;
	}

	public boolean tol(double[][] m_new, double [][] m) {
		int counter = 0;
		int c = m.length * m[0].length;
		double resta = 0;
		
		for (int x = 0; x < m.length; x++) {
			for (int y = 0; y < m[x].length; y++) {
				resta = m[x][y]-m_new[x][y];
				System.out.println(resta);
				if(resta > -0.000001 && resta < 0.000001 && counter<c) {
				counter++;
				}
			}
		}
		if (counter == c) {
		return true;}
		else {
			return false;
		}
	}
}
