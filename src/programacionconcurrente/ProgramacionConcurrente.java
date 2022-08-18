/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionconcurrente;

/**
 *
 * @author cristopher.ovaillos
 */
public class ProgramacionConcurrente {

    /**
     * @param args the command line arguments
     */
    public static double acceso_por_indice(double[] v, int j) throws RuntimeException {

        try {
            if ((0 <= j) && (j <= v.length)) {
                return v[j];
            } else {
                throw new RuntimeException("El indice " + j + " no existe en el vector");
            }
        } catch (RuntimeException exc) {
            throw exc;
        }
    }

// Desde el siguiente cliente “main”:
    public static void main(String[] args) {
        double[] v = new double[15];
        acceso_por_indice(v, 16);
    }

}
