package Trabalho_POO.Proxy_Proteção;

class DocumentoReal implements Documento {
    private String conteudo;
    private String proprietario;

    public DocumentoReal(String conteudo, String proprietario) {
        this.conteudo = conteudo;
        this.proprietario = proprietario;
    }

    @Override
    public void visualizar() {
        System.out.println("Visualizando: " + conteudo.substring(0, Math.min(50, conteudo.length())));
    }

    @Override
    public void editar() {
        System.out.println("Editando: " + conteudo);
    }

    @Override
    public void compartilhar(String usuario) {
        System.out.println("Compartilhando com: " + usuario);
    }

    public String getProprietario() {
        return proprietario;
    }
}