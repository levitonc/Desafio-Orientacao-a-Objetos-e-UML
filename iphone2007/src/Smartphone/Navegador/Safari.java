package Smartphone.Navegador;

public class Safari implements NavegadorInternet {

     
             @Override
    public void pagina(){
        System.out.println("Pagina Aberta");
    }
          
            @Override
    public void adicionandoNovaPagina() {
        System.out.println("Adicionando nova pagina");
    }
             @Override
    public void atualizandoPagina(){
        System.out.println("Atualizando nova Pagina");
    }

}