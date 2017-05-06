package com.example.iossenac.applogin.model;


public class Usuario {
    private String username, senha;

    public Usuario(String username, String senha) {
        this.username = username;
        this.senha = senha;
    }

    public String getUsername() {
        return username;
    }

    public String getSenha() {
        return senha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Usuario usuario = (Usuario) o;

        if (username != null ? !username.equals(usuario.username) : usuario.username != null)
            return false;
        return senha != null ? senha.equals(usuario.senha) : usuario.senha == null;

    }

}