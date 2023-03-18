package exercitando;

import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv= new SmartTv();

        System.out.println("A tv esta ligada? "+smartTv.ligada);
        System.out.println("Qual o volume Atual? "+smartTv.volume);
        System.out.println("Qual o Canal Atual? "+smartTv.canal);


        smartTv.ligar();
        System.out.println("NOVO STATUS\nA tv esta ligada? "+smartTv.ligada);

        System.out.println("---------------------------------------------");

        System.out.println("Qual o volume atual? : "+smartTv.volume);
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("---------------------------------------------");
        System.out.println("Canal atual: "+smartTv.canal);
        smartTv.setCanal(13);
        smartTv.aumentarDeCanal();
        smartTv.setCanal(5);
        System.out.println("Digite o seu canal: ");
        Scanner sc = new Scanner(System.in);
        int canall= sc.nextInt();
        smartTv.setCanal(canall);


    }



}
