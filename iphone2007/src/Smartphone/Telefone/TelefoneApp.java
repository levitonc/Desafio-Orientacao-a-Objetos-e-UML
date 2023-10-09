package Smartphone.Telefone;

public class TelefoneApp implements AparelhoTelefonico {
    
    @Override
    public void ligar() {
        System.out.println("Ligar");
    }

    @Override
    public void atender() {
        System.out.println("Atender");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciar correio de voz");
    }
}
