
//Classe
public class MinhaClasse {
    public static void main(String[] args) {


        System.out.println("Olá turma\n" +
                "sejam bem-vindos");

        String prmimeiroNome="Nicolas";
        String segundoNome="Albuquerque";
        String nomeCompleto=nomeCompleto(prmimeiroNome,segundoNome);

        String meuNome = "Nicolas";//declarando variáveis
        int anoNascimento = 1994;
        boolean simNao = true ;

        anoNascimento=2022;//alterando tipo

        //metodos



       // Estrutura
       //TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)

       //  Exemplo.
       //  int somar (int numeroUm, int numeroDois){}
       // String formatarCep (longcep)

        System.out.println(nomeCompleto);

    }
    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado do metodo  "+ primeiroNome.concat(" ").concat(segundoNome);
    }

}
