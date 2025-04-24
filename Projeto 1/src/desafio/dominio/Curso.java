package desafio.dominio;

public class Curso extends Conteudo{
    
    int cargaHoraria;

    
    @Override
    protected  double calcularXp() {
      return  xpPadrao + (cargaHoraria);
    }
    

    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria(){
        return cargaHoraria;
    }
    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

}
