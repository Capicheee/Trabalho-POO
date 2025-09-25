package Trabalho_POO.Proxy_Preguiçoso;

class ImagemReal implements Imagem {
    private String arquivo;
    private int largura;
    private int altura;

    public ImagemReal(String arquivo) {
        this.arquivo = arquivo;
        carregarDoDisco();
    }

    private void carregarDoDisco() {
        System.out.println("Carregando imagem: " + arquivo);
        // Simula um carregamento pesado
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.largura = 800;
        this.altura = 600;
        System.out.println(arquivo + "Carregado");
    }

    @Override
    public void mostrar() {
        System.out.println("Exibindo imagem: " + arquivo);
    }

    @Override
    public int getLargura() {
        return largura;
    }

    @Override
    public int getAltura() {
        return altura;
    }
}