package Smartphone.Musica;

public class Musica implements ReproduzirMusica {



            @Override
    public void tocar() {
        System.out.println("Tocando Música.");
       
        
    }

            @Override
    public void pausar() {
        System.out.println("Musica Pausada");
        
    }

             @Override
    public void selecionarMusica() {
        System.out.println("Selecionar Música");
        
    }
}
