package Trabalho_POO.Proxy_Proteção;

public class MainProxy {
    public static void main(String[] args) {
        String[] usuariosAutorizados = {"ana", "carlos"};
        Documento documentoProxy = new ProxyDocumento(
            "Senha Importante 123", 
            "joao", "maria", usuariosAutorizados);
        
        // Tentativa de acesso sem permissão
        documentoProxy.visualizar(); // Maria não está autorizada
        documentoProxy.editar();     // Maria não é proprietária
        
        // Criando um proxy com usuário autorizado
        Documento documentoProxy2 = new ProxyDocumento(
            "Senha Importante 456", 
            "joao", "ana", usuariosAutorizados);
        
        documentoProxy2.visualizar(); // Ana está autorizada
        documentoProxy2.editar();     // Ana não é proprietária
        System.out.println();
    }
}
