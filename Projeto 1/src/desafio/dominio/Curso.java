package desafio.dominio;

public class Curso extends Conteudo{
    
    int cargaHoraria;

    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria(){
        return cargaHoraria;
    }
}
