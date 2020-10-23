package ro.mta.facc.selab;

public class Carte implements Comparable<Carte>{
    private String titlu;
    private int an_aparitie;
    private int nr_pag;
    private String autor;

    @Override
    public int compareTo(Carte o) {
        if( this.nr_pag < o.nr_pag)
            return -1;
        if( this.nr_pag > o.nr_pag)
            return 1;
        return 0;
    }

    public Carte(String titlu, int an_aparitie, int nr_pag, String autor) {
        this.titlu = titlu;
        this.an_aparitie = an_aparitie;
        this.nr_pag = nr_pag;
        this.autor = autor;
    }

    @Override public String toString(){
        return this.titlu + " " + this.autor + ", aparuta in " + this.an_aparitie;
    }
}
