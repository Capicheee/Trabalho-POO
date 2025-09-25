package Trabalho_POO.Proxy_Preguiçoso;

class ProxyImagem implements Imagem {
    private String arquivo;
    private ImagemReal imagemReal;

    public ProxyImagem(String arquivo) {
        this.arquivo = arquivo;
    }

    @Override
    public void mostrar() {
        if (imagemReal == null) {
            imagemReal = new ImagemReal(arquivo);
        }
        imagemReal.mostrar();
    }

    @Override
    public int getLargura() {
        if (imagemReal == null) {
            System.out.println("Imagem ainda não carregada.");
            return 10;
        }
        return imagemReal.getLargura();
    }

    @Override
    public int getAltura() {
        if (imagemReal == null) {
            System.out.println("Imagem ainda não carregada.");
            return 10;
        }
        return imagemReal.getAltura();
    }
}