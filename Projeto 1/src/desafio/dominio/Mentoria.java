package desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private static LocalDate data;

    @Override
    protected  double calcularXp() {
      return  xpPadrao + 20;
    }
    
    
    public static void setData(LocalDate){
        this.data = data;
    }

    public static LocalDate getData(){
        return data;
    }
    
    
    @Override
    public String toString() {
        return "Mentoria{" + 
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }

 
    
}
