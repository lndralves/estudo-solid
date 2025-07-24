package com.estudo.estudosolid.srp.errado;

import com.estudo.estudosolid.srp.Usuario;

public class UsuarioRepository {

    public void cadastrar(Usuario usuario) {
        // Implementa a lógica para cadastro de usuário
    }

    public void editar(Usuario usuario) {
        // Implementa a lógica para alterar um usuário
    }

    public void excluir(Usuario usuario) {
        // Implementa a lógica para excluir um usuário
    }

    /*
    * A lógica para envio de emails não deveria ser definida aqui, pois foge daquilo que se imagina que uma classe
    * Repository faria. Não deveria ser responsabilidade desta classe definir a lógica para envio de emails.
    * */
    private void enviarMensagemDeBoasVindas(Usuario usuario){
        // Implementa a lógica para envio de emails
    }

}
