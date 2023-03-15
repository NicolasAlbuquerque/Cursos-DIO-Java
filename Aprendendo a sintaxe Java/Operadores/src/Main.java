public class Main {
    public static void main(String[] args) {
     //         OPERADORES
        //São simbolos especiaais que tem um significado proprio.

        /*
        Operadores Aritiméticos
        Operadores Unários
        Operadores Relacionais
        Operadores Lógicos
        Operador ternário

        System.out.println("---------------------------------------------");


        */
        // ATRIBUIÇÃO "="
        String nome = "Nicolas";
        System.out.println("---------------------------------------------");

        //ARITMÉTICOS
            // + * / -

         int soma= 1+2;
         int divi= 12/2;
         int modulo= 18%3;

         // UNÁRIO
        /*
        * + VALOR POSITIVO
        * - VALOR NEGATIVO
        * ++ INCREMENTO
        * -- DECREMENTO
        * ! NEGAÇÃO
        * */
        System.out.println("---------------------------------------------");

         int num =5;
         num = -num;//tornar o numero negativo
        System.out.println(num);
        num= num*-1; //tornar o valor positivo
        System.out.println(num);

        //incremento
        num++;
        System.out.println(num);//num= num+1
        //decremento
        num--;
        System.out.println(num);//num=num-1

        boolean variavel=true;
        System.out.println(variavel);
        variavel= !variavel;
        System.out.println(variavel);

        System.out.println("----------------------------------");
        //TERNÁRIO ?:

        //<expressão condicional> ? <Caso condição seja true> :
        //<Caso condição seja false>

        int a=6;
        int b=5;

        String resultado="";

        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";

      System.out.println(resultado);

       resultado = a==b ?"verdadeiro" : "Falso";

        System.out.println(resultado);
        System.out.println("---------------------------------------------");

        //Relacionais
int numero1 = 1;
int numero2 = 2;

    boolean simNao= numero1 ==numero2;

        System.out.println("NumeroUM é igual a NumeroDois? "+ simNao);
        simNao= numero1 !=numero2;

        System.out.println("NumeroUM é diferente a NumeroDois? "+ simNao);
        simNao= numero1 >numero2;

        System.out.println("NumeroUM é maior a NumeroDois? "+ simNao);
        simNao= numero1 <numero2;

        System.out.println("NumeroUM é menor a NumeroDois? "+ simNao);
        simNao= numero1 >=numero2;

        System.out.println("NumeroUM é menor ou igual a NumeroDois? "+ simNao);
        simNao= numero1 <=numero2;

        System.out.println("NumeroUM é maior ou igual a NumeroDois? "+ simNao);

        String nome1 =  "nico";//string é objeto
        String nome2 = new String ("nico");// objetos use equals

        System.out.println(nome1.equals(nome2));

        System.out.println("---------------------------------------------");

        //Lógicos.
        //&& ||

        boolean condi1=true;

        boolean condi2=false;

        if(condi1&&condi2)
            System.out.println("As duas são Verdadeiras");
        else
            System.out.println("fim");


        if (condi1||condi2)
            System.out.println("Uma das condições é verdadeira");
        else
            System.out.println("fim");
    }
}