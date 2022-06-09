package operations;

import java.awt.EventQueue;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;

import org.math.plot.Plot2DPanel;
import org.math.plot.Plot3DPanel;

import objects.Matrix_Object;

public class Interface_methods {

	public double[][] muscle_select(double[][] x, ArrayList<Integer> num) {
		int n1 = 0, n2 = 0, n3 = 0, n4 = 0;
		if (num.size() == 4) {
			n1 = num.get(0);
			n2 = num.get(1);
			n3 = num.get(2);
			n4 = num.get(3);
		} else {
			System.out.println("There are not 4 muscles selected");
		}
		ArrayList<Double> h = new ArrayList<Double>();
		for (int i = 0; i < num.size(); i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (i == 0) {
					h.add(x[n1][j]);
				} else if (i == 1) {
					h.add(x[n2][j]);
				} else if (i == 2) {
					h.add(x[n3][j]);
				} else if (i == 3) {
					h.add(x[n4][j]);
				}
			}
		}
		double[][] h_init = new double[num.size()][x[0].length];
		int i = 0;
		for (int a = 0; a < h_init.length; a++) {
			for (int b = 0; b < h_init[a].length; b++) {
				h_init[a][b] = h.get(i);
				i++;
			}
		}
		return h_init;
	}

	public Matrix_Object iteration(double[][] x, double[][] h, double[][] w) {
		Fractions frac = new Fractions();
		double[][] w_n = new double [w.length][w[0].length];
		double[][] h_n = new double [h.length][h[0].length];
		w_n= frac.w_fraction(x, h, w);
		h_n= frac.h_fraction(x, h, w_n);
		Matrix_Object object = new Matrix_Object();
		object.setM1(w_n);
		object.setM2(h_n);
		return object;
	}

	public void show_graphics(double[][] h,double[][] h2, int n) {
		ArrayList<Double> aux = new ArrayList<Double>();
		ArrayList<Double> aux2 = new ArrayList<Double>();
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < h[i].length; j++) {
				if (i == n) {
					aux.add(h[n][j]);
					aux2.add(h2[n][j]);
				}
			}
		}
		double[] array = new double[h[0].length];
		double[] array2 = new double[h2[0].length];
        for(int i = 0; i < h[0].length; i++) {
            array[i] = aux.get(i);
            array2[i] = aux2.get(i);
        }
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Plot2DPanel plot = new Plot2DPanel();
					plot.addLinePlot("Previous",array);
					plot.addLinePlot("Reconstructed",array2);
					plot.addLegend("SOUTH");
					JFrame frame = new JFrame("Muscle synergies");
					frame.setSize(500,500);
					frame.setContentPane(plot);
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void show_matrixH (double [][] m, String name, int n) {
		ArrayList<Double> aux = new ArrayList<Double>();
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				if (i == n) {
					aux.add(m[n][j]);
				}
			}
		}
		double[] array = new double[m[0].length];
        for(int i = 0; i < m[0].length; i++) {
            array[i] = aux.get(i);
        }
	    EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				Plot2DPanel plot = new Plot2DPanel();
				plot.addLinePlot("New",array);
				plot.addLegend("SOUTH");
				JFrame frame = new JFrame(name);
				frame.setSize(500,500);
				frame.setContentPane(plot);
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
	}
	    public void show_matrixW (double [][] m, String name, int n) {
			ArrayList<Double> aux = new ArrayList<Double>();
			for (int i = 0; i < m.length; i++) {
				for (int j = 0; j < m[0].length; j++) {
					if (i == n) {
						aux.add(m[n][j]);
					}
				}
			}
			double[] array = new double[m[0].length];
	        for(int i = 0; i < m[0].length; i++) {
	            array[i] = aux.get(i);
	        }
		    EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Plot2DPanel plot = new Plot2DPanel();
					plot.addHistogramPlot("New",array,60);
					plot.addLegend("SOUTH");
					plot.setAxisLabels(null);
					plot.setFont(new Font("Times New Roman", Font.BOLD, 26));
					JFrame frame = new JFrame(name);
					frame.setSize(500,500);
					frame.setContentPane(plot);
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
}
}