/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4analisisnumerico;

/**
 *
 * @author fatycalderon
 */
public class InterpolacionLagrange {
    
    public static double solucionar(Polinomio[] L, double[] fx, double x) {
		double acum = 0;
		int n = fx.length;
		for (int i = 0; i < n; i++) {
			acum += (L[i].evaluar(x) * fx[i]);
		}
		return acum;
	}

	public static Polinomio[] getCoeficientes(double[] xs) {
		int n = xs.length;
		Polinomio[] L = new Polinomio[n];
		for (int i = 0; i < n; i++) {
			double denom = 1;
			L[i] = new Polinomio();
			for (int j = 0; j < n; j++) {
				if (i != j) {
					double[] co = { -xs[j], 1 };
					L[i] = L[i].multiplicar(new Polinomio(co));
					denom *= (xs[i] - xs[j]);
				}
			}
			L[i] = L[i].dividir(denom);
		}
		return L;
	}

	
}
