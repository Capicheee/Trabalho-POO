package Trabalho_POO.Proxy_Preguiçoso;

public class MainProxy {
    public static void main(String[] args) {
        Imagem imagemProxy = new ProxyImagem("foto_grande.jpg");
        
        // A imagem ainda não foi carregada
        System.out.println("Largura (sem carregar): " + imagemProxy.getLargura());
        
        // Agora a imagem foi carregada
        imagemProxy.mostrar();
        System.out.println("Largura (após carregar): " + imagemProxy.getLargura());
        System.out.println();
    }
}