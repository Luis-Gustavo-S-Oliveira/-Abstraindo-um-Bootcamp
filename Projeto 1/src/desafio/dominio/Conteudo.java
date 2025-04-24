package desafio.dominio;

public class Conteudo {
    private String titulo;
    private String descricao;

    static  final double xpPadrao = 10.0;

    public String getTitulo (){
        return titulo;
    }

    public void setTitulo ( String titulo){
        this.titulo = titulo;
    }

    public String getDescricao(){
        return descricao;

    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
}
