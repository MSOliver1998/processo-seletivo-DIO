import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

class Main{
    public static void main(String[] args){
        System.err.println("processo seletivo!");
        String[] selecionados={ "Matheus","André","Ana","Júlia","Pablo"};
        for(String candidato: selecionados){
            int tentativas=1;
            boolean continuarTentando=true;

            do{
                continuarTentando=!chamar(candidato);
                if(continuarTentando==false){
                    System.err.println("Conseguimos o contato com o candidato " + candidato +  " após " + tentativas + " tentativas");
                }else{
                    tentativas++;
                }

            }while(tentativas<3 && continuarTentando==true);
            
            if(tentativas==3 && continuarTentando==true){
                System.err.println("Não conseguimos contato com o candidato " + candidato);
            }
        }

    }

    static void analisarCandidato(double salario){
        double salarioBase=2000.0;
        if(salario<salarioBase){
            System.err.println("ligar para o candidato");
        }else if(salario==salarioBase){
            System.err.println("ligar para o candidato com a contra-proposta");
        }else{
            System.err.println("aguardando o resultado dos demais candidatos");
        }
    }

    static void imprimirSelecao(){
        String[] selecionados={ "Matheus","André","Ana","Júlia","Pablo"};
        
        /* for(int i=0;i<selecionados.length;i++){
            System.err.println("O candidato número " + (i+1) + " é " + selecionados[i]);
        }  */

        for(String candidato: selecionados){
            System.err.println("o candidato " + candidato + " foi selecionado!");
        }
    }

    static void selecaoDeCandidatos(){
        String[] candidatos={"Felipe","Matheus","Marcos","Marcia","Maria","Júlia","Ana","Suzana","Fernanda","Bruna","Paula","Juliana","Pablo"};
        int candidatosSelecionados=0;
        int candidato=0;
        while (candidatosSelecionados<5 && candidato<candidatos.length-1) {
            String candidatoName=candidatos[candidato];
            double salarioPretendido=salarioPretendido();
            System.err.println("ocandidato " + candidatoName + " solicitou " + salarioPretendido);
            if(salarioPretendido<2000.0){
                System.err.println("o candidato " + candidatoName + " foi selecionado ");
                candidatosSelecionados ++;
            }
            candidato ++;
        }
    }

    static boolean chamar(String candidato){
        return new Random().nextInt(3)==1;
    }

    static Double salarioPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }
}