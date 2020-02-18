package pojo;

import interfaces.Enderecavel;

public class Carta implements Enderecavel {

    private int id;
    private String destino;
    private String origem;
    private String texto;


    public Carta(int id, String destino, String origem, String texto){
        this.id = id;
        this.destino = destino;
        this.origem = origem;
        this.texto = texto;
    }


    @Override
    public int getIdentificador() {
        return id;
    }

    @Override
    public String getCidadeOrigem() {
        return origem;
    }

    @Override
    public String getCidadeDestino() {
        return destino;
    }

    public String getTexto(String texto){
        return texto;
    }
}
