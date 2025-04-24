package desafio.dominio;

public class Mentoria {
    String titulo;
    String descricao;

    public String getTitulo (){
        return titulo;
    }

    public void setTitulo ( String titulo){
        this.titulo = titulo;
    }

    @Override
    public String toString(){
        return titulo + descricao + "vai tomar no cu ";
    }
    
}
