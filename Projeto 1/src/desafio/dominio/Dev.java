package desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet(); 

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;

    }

    public void increverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir(){
        Optional <Conteudo> conteudos = this.conteudosInscritos.stream().findFirst();
        if(conteudos.isPresent()){
            this.conteudosConcluidos.add(conteudos.get());
            this.conteudosInscritos.remove(conteudos.get());

        }else {
            System.err.println("voce nao esta matriculado em nenhum conteudo ");
        }

    }


    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
        
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }


    public double calcularTotalXp(){
        return this.conteudosConcluidos
        .stream()
        .mapToDouble(Conteudo::calcularXp)
        .sum();

        /*Iterator<Conteudo> iterator = this.conteudosConcluidos.iterator();
        double soma = 0;
        while(iterator.hasNext()){
            double next = iterator.next().calcularXp();
            soma += next; */
    }

      @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }

    private void sum() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

