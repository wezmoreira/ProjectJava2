
package mapapsii;

import java.util.Arrays;
/**
 * @author Wesley Rodrigo Moreira  -  RA: 1948068-5
 */
public class Hotel {
    String[] numHospSimples = {"1", "2", "3"};
    String[] numHospLuxo = {"4", "5", "6"};
    double[] FHospSimples = {1, 2, 3};
    double[] FHospLuxo = {4, 5, 6};
    String[] tipo = {"Simples", "Luxo"};
    Double precoSimples = 60.00;
    Double precoLuxo = 100.00;
    int capacidadeSimples = 4;
    int capacidadeLuxo = 8;
    
    @Override
    public String toString() {
        return "Hospedagem [FHospLuxo=" + Arrays.toString(FHospLuxo) + ", FHospSimples=" + Arrays.toString(FHospSimples)
                + ", tipo=" + Arrays.toString(tipo) + "]";
    }
}
