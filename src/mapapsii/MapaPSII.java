
package mapapsii;
/**
 * @author Wesley Rodrigo Moreira  -  RA: 1948068-5
 */
import javax.swing.JOptionPane;

public class MapaPSII {

    public static void main(String[] args) {
        Hospedes hospede = new Hospedes();
        Hotel hospedagem = new Hotel();
        Reserva reserva = new Reserva();
        
        Object escolha = JOptionPane.showInputDialog(null, "Escolha o tipo de reserva", "Opçao", 
        JOptionPane.INFORMATION_MESSAGE, null,
        hospedagem.tipo , hospedagem.tipo [0]);
        
        StringBuilder mensagem = new StringBuilder();
        
        System.out.println(hospede.getNome());
        
        if(escolha == "Simples"){
            String iQtdDiarias = JOptionPane.showInputDialog("Quantos dias ficará no hotel?");
            reserva.setQtdDiaria(Integer.parseInt(iQtdDiarias));
            
            String iQtdPessoas = JOptionPane.showInputDialog("Quantidade de Pessoas");
            reserva.setQtdPessoas(Integer.parseInt(iQtdPessoas));
            
            if(reserva.getQtdPessoas() > hospedagem.capacidadeSimples){
                mensagem.append("A capacidade maxima da suite simples é: ").append(hospedagem.capacidadeSimples)
                .append(" Tente novamente");
                JOptionPane.showMessageDialog(null, mensagem);
                System.exit(1);
            }else{
                
                JOptionPane.showInputDialog(null, "Escolha uma Suite", "Opçao", 
                JOptionPane.INFORMATION_MESSAGE, null,
                hospedagem.numHospSimples , hospedagem.numHospSimples [0]);
                hospedagem.FHospSimples[0] = Integer.parseInt(hospedagem.numHospSimples[0]);
                hospedagem.FHospSimples[1] = Integer.parseInt(hospedagem.numHospSimples[1]);
                hospedagem.FHospSimples[2] = Integer.parseInt(hospedagem.numHospSimples[2]);
                
                reserva.setHospede(JOptionPane.showInputDialog("Nome da empresa/pessoa responsavel"));
                
                System.out.println("**** CADASTRO ****");
                System.out.println("Nome do responsavel: " + reserva.getHospede());
                System.out.println("Quantidade de diarias: " + reserva.getQtdDiaria());
                System.out.println("Quantidade de pessoas: " + reserva.getQtdPessoas());
                System.out.println("\n******** Hospedes ********");
                System.out.println("****** Bem ** Vindo ******");

                
                int contagem = reserva.getQtdPessoas();
                
                for(int i = 0; i < contagem; i++){
                    hospede.setNome(JOptionPane.showInputDialog("Nome do hospede " + (i + 1)));
                    hospede.setEndereco(JOptionPane.showInputDialog("Endereço do hospede " + (i + 1)));
                    String iIdade = JOptionPane.showInputDialog("Idade do hospede " + (i + 1));
                    hospede.setIdade(Integer.parseInt(iIdade));
                    if(hospede.getIdade() <= 2){
                    int pessoasQtd = reserva.getQtdPessoas() - 1;
                    reserva.setQtdPessoas(pessoasQtd);
                    }
                    System.out.println((i + 1) + " - Hospede: " + hospede.getNome());
                    System.out.println("Endereço: " + hospede.getEndereco());
                    System.out.println("Idade: " + hospede.getIdade());
                }
                
                int pessoas = contagem;
                double total = reserva.getQtdDiaria() * pessoas;
                total *= hospedagem.precoSimples;
                if(reserva.getQtdDiaria() > 7){
                    total = total - (total * 0.10) ;
                }
                
                System.out.println("Total a ser cobrado: " + total);


                if(reserva.getQtdDiaria() >= 7){
                    mensagem.append("Acima de 7 dias você tem 10% de desconto! Com isso o preço da reserva ficou ").append(total)
                    .append("$ para ").append(reserva.getQtdDiaria()).append(" dias, com ").append(reserva.getQtdPessoas()).append(" Pessoas");
                    JOptionPane.showMessageDialog(null, mensagem);
                }
                else if(reserva.getQtdDiaria() < 7){
                    mensagem.append("O preço da reserva ficou ").append(total)
                    .append("$ para ").append(reserva.getQtdDiaria()).append(" dias, com ").append(reserva.getQtdPessoas()).append(" Pessoas");
                    JOptionPane.showMessageDialog(null, mensagem);
                }

            }
        }
        else if(escolha == "Luxo"){
            String iQtdDiarias = JOptionPane.showInputDialog("Quantidade de diarias");
            reserva.setQtdDiaria(Integer.parseInt(iQtdDiarias));

            String iQtdPessoas = JOptionPane.showInputDialog("Quantidade de Pessoas");
            reserva.setQtdPessoas(Integer.parseInt(iQtdPessoas));

            if(reserva.getQtdPessoas() > hospedagem.capacidadeLuxo){
                mensagem.append("A capacidade maxima da suite Luxo é ").append(hospedagem.capacidadeLuxo)
                .append(" Tente novamente");
                JOptionPane.showMessageDialog(null, mensagem);
                System.exit(1);
            }else{

                JOptionPane.showInputDialog(null, "Escolha uma Suite", "Opçao", 
                JOptionPane.INFORMATION_MESSAGE, null,
                hospedagem.numHospLuxo , hospedagem.numHospLuxo [0]);
                hospedagem.FHospLuxo[0] = Integer.parseInt(hospedagem.numHospLuxo[0]);
                hospedagem.FHospLuxo[1] = Integer.parseInt(hospedagem.numHospLuxo[1]);
                hospedagem.FHospLuxo[2] = Integer.parseInt(hospedagem.numHospLuxo[2]);
    
                reserva.setHospede(JOptionPane.showInputDialog("Nome da empresa/pessoa responsavel"));
                
                System.out.println("**** CADASTRO ****");
                System.out.println("Nome do responsavel: " + reserva.getHospede());
                System.out.println("Quantidade de diarias: " + reserva.getQtdDiaria());
                System.out.println("Quantidade de pessoas: " + reserva.getQtdPessoas());
                System.out.println("\n******** Hospedes ********");
                System.out.println("****** Bem ** Vindo ******");
         
                int contagem = reserva.getQtdPessoas();

                for(int i = 0; i < contagem; i++){
                    hospede.setNome(JOptionPane.showInputDialog("Nome do hospede " + (i + 1)));
                    hospede.setEndereco(JOptionPane.showInputDialog("Endereço do hospede " + (i + 1)));
                    String iIdade = JOptionPane.showInputDialog("Idade do hospede " + (i + 1));
                    hospede.setIdade(Integer.parseInt(iIdade));
                    if(hospede.getIdade() <= 2){
                    int pessoasQtd = reserva.getQtdPessoas() - 1;
                    reserva.setQtdPessoas(pessoasQtd);
                    }
                    System.out.println((i + 1) + " - Hospede: " + hospede.getNome());
                    System.out.println("Endereço: " + hospede.getEndereco());
                    System.out.println("Idade: " + hospede.getIdade());
                }
                
                int pessoas = contagem;
                double total = reserva.getQtdDiaria() * pessoas;
                total *= hospedagem.precoLuxo;
                if(reserva.getQtdDiaria() > 7){
                    total = total - (total * 0.10) ;
                }
                
                System.out.println("Total a ser cobrado: " + total);
                
                if(reserva.getQtdDiaria() >= 7){
                    mensagem.append("Acima de 7 dias você tem 10% de desconto! Com isso o preço da reserva ficou ").append(total)
                    .append("$ para ").append(reserva.getQtdDiaria()).append(" dias, com ").append(reserva.getQtdPessoas()).append(" Pessoas");
                    JOptionPane.showMessageDialog(null, mensagem);
                }
                else if(reserva.getQtdDiaria() < 7){
                    mensagem.append("O preço da reserva ficou ").append(total)
                    .append("$ para ").append(reserva.getQtdDiaria()).append(" dias, com ").append(reserva.getQtdPessoas()).append(" Pessoas");
                    JOptionPane.showMessageDialog(null, mensagem);
                }                
                
            }
        }
    }
    
}
