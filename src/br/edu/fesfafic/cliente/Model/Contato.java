package br.edu.fesfafic.cliente.Model;

public class Contato {
    public String numContato;
    public String email;

    public Contato(){}
    public Contato(String numContato, String email) {
        this.numContato = numContato;
        this.email = email;
    }

    public String getNumContato() {
        return numContato;
    }

    public void setNumContato(String numContato) {
        this.numContato = numContato;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "numContato='" + numContato + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
