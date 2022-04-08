
package mapapsii;

/**
 * @author Wesley Rodrigo Moreira  -  RA: 1948068-5
 */
public class Reserva {
    private int qtdDiaria;
    private int qtdPessoas;
    private String suite;
    private String hospede;
    
    
    public Reserva(){
    }
    
    public int getQtdDiaria(){
        return qtdDiaria;
    }
    public void setQtdDiaria(int qtdDiaria){
        this.qtdDiaria = qtdDiaria;
    }
    
    public int getQtdPessoas(){
        return qtdPessoas;
    }
    public void setQtdPessoas(int qtdPessoas){
        this.qtdPessoas = qtdPessoas;
    }
    
    public String getSuite(){
        return suite;
    }
    public void setSuite(String suite){
        this.suite = suite;
    }
    
    public String getHospede(){
        return hospede;
    }
    public void setHospede(String hospede){
        this.hospede = hospede;
    }
    
}
