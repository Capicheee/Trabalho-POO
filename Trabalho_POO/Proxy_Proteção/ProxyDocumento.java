package Trabalho_POO.Proxy_Proteção;

import java.util.Arrays;

class ProxyDocumento implements Documento {
    private DocumentoReal documentoReal;
    private String usuarioAtual;
    private String[] usuariosAutorizados;

    public ProxyDocumento(String conteudo, String proprietario, String usuarioAtual, String[] usuariosAutorizados) {
        this.documentoReal = new DocumentoReal(conteudo, proprietario);
        this.usuarioAtual = usuarioAtual;
        this.usuariosAutorizados = usuariosAutorizados;
    }

    private boolean temPermissaoVisualizacao() {
        return usuarioAtual.equals(documentoReal.getProprietario()) || 
               Arrays.asList(usuariosAutorizados).contains(usuarioAtual);
    }

    private boolean temPermissaoEdicao() {
        return usuarioAtual.equals(documentoReal.getProprietario());
    }

    @Override
    public void visualizar() {
        if (temPermissaoVisualizacao()) {
            documentoReal.visualizar();
        } else {
            System.out.println("Acesso negado: Você não tem permissão para visualizar este documento");
        }
    }

    @Override
    public void editar() {
        if (temPermissaoEdicao()) {
            documentoReal.editar();
        } else {
            System.out.println("Acesso negado: Apenas o proprietário pode editar este documento");
        }
    }

    @Override
    public void compartilhar(String usuario) {
        if (temPermissaoEdicao()) {
            documentoReal.compartilhar(usuario);
        } else {
            System.out.println("Acesso negado: Apenas o proprietário pode compartilhar este documento");
        }
    }

    public String getProprietario() {
        return documentoReal.getProprietario();
    }
}