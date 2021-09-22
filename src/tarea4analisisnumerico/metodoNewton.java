/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4analisisnumerico;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author fatycalderon
 */
public class metodoNewton {
    
	private static double[] b;
	private static boolean[][] yaCalculado; // ¿El valor ya fue calculado?
	private static double[][] calculoPrevio; // Valor previamente calculado
	private static double[] x;
	private static double[] fx;

	public  double[] solucionar(double[] x, double[] fx) {
		int n = x.length;
		b = new double[n];
		yaCalculado = new boolean[n][n];
		calculoPrevio = new double[n][n];
		metodoNewton.x = x;
		metodoNewton.fx = fx;
		b[0] = fx[0];
		diferenciasDivididas(x.length - 1, 0);
		return b;
	}
        public void Mostrar(){
            JTextArea h=new JTextArea();
            String a ="";
            int n = x.length;
            for(int i=0;i<n;i++){
              for(int j=0;j<n;j++){
                  a="|"+yaCalculado[i][j]+"|";
              }
              h.setText("\n"+a);
            }
            JOptionPane.showMessageDialog(null,h);
        }

	public  double diferenciasDivididas(int i, int k) {
		if (i == k)
			return fx[i];
		double f1 = 0;
		if (yaCalculado[i - 1][k]) {
			f1 = calculoPrevio[i - 1][k];
		} else {
			f1 = diferenciasDivididas(i - 1, k);
		}
		double f2 = 0;
		if (yaCalculado[i][k + 1]) {
			f2 = calculoPrevio[i][k + 1];
		} else {
			f2 = diferenciasDivididas(i, k + 1);
		}
		double dd = (f1 - f2) / (x[k] - x[i]);
		yaCalculado[i][k] = true;
		calculoPrevio[i][k] = dd;
		if (k == 0) // b[i] = f[i,0]
			b[i] = dd;
		return dd;
	}

	public  double calcularValor(double x, double[] b, double[] xs) {
		double res = 0;
		for (int i = 0; i < b.length; i++) {
			double acum = b[i];
			for (int j = 0; j < i; j++)
				acum *= (x - xs[j]);
			res += acum;
		}
         return res;
        }
}
