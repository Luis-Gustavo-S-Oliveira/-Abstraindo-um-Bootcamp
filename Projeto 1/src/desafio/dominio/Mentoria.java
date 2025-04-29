package desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;

    @Override
    protected  double calcularXp() {
      return  xpPadrao + 20;
    }
    
    
    public void setData(LocalDate data){
        this.data = data;
    }

    public LocalDate getData(){
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
