import java.util.concurrent.ThreadLocalRandom;

class Main{
    public static void main(String[] args){
        System.err.println("processo seletivo!");
        selecaoDeCandidatos();
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

    static Double salarioPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }
}