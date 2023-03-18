package exercitando;

public class SmartTv {



    boolean ligada= false;
    int canal=1;
    int volume=10;

    public void  ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }
     public void aumentarVolume(){
        volume++;
         System.out.println("Aumentando o volume para: "+volume);
     }
     public void diminuirVolume(){
        volume--;
         System.out.println("Diminuindo o volume para: "+ volume);
     }
     public void aumentarDeCanal(){
        canal++;
         System.out.println("Canal Atual: "+ canal);
     }

    public void dimunuirCanal() {
        canal--;
        System.out.println("Canal Atual: "+ canal);
    }

    public void setCanal(int novoCanal) {
        canal=novoCanal;
        System.out.println("Canal Atual: "+ canal);

    }
}
