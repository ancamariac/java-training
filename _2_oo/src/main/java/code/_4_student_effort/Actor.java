package code._4_student_effort;

public class Actor {

    private String nume;
    private Integer varsta;
    private Premiu[] premii;

    public Actor(String nume, Integer varsta, Premiu[] premii) {
        this.nume = nume;
        this.varsta = varsta;
        this.premii = premii;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public String getNume() {
        return nume;
    }
}
