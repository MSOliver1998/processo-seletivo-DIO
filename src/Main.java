class Main{
    public static void main(String[] args){
        System.err.println("processo seletivo!");
        analisarCandidato(1900);
        analisarCandidato(2200);
        analisarCandidato(2000);
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
}