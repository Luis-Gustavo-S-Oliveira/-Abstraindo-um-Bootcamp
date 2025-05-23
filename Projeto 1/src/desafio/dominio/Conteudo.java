package desafio.dominio;

public abstract class Conteudo {
    private String titulo;
    private String descricao;

    protected static  final double xpPadrao = 10.0;

    protected  abstract double calcularXp();
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
