package Contatos;

import java.util.HashMap;
import java.util.Map;

public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private String rg;
    private String data;
    private Map<String, String> email;
    private Map<String, String> telefone;
    private Map<String, String> endereco;

    public Pessoa(String nome, String rg, String data) {

        this.nome = nome;
        this.data = data;
        this.rg = rg;

        this.email = new HashMap<String, String>();
        this.telefone = new HashMap<String, String>();
        this.endereco = new HashMap<String, String>();

    }

    @Override
    public String toString() {
        return String.format(
                "Nome: %s;\n RG: %s;\n Data de nascimento: %s;\n Email: %s;\n Telefone: %s;\n Endereço: %s", nome, rg,
                data, getEmail().get("EmailPrincipal"), getTelefone().get("Celular"), getEndereco().get("Residencial"));
    }

    @Override
    public int compareTo(Pessoa o) {
        return this.nome.compareTo(o.nome);
    }

    public Map<String, String> getEmail() {
        return email;
    }

    public Map<String, String> getEndereco() {
        return endereco;
    }

    public Map<String, String> getTelefone() {
        return telefone;
    }

    public void setEmail(Map<String, String> email) {
        this.email = email;
    }

    public void setTelefone(Map<String, String> telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(Map<String, String> endereco) {
        this.endereco = endereco;
    }

}
