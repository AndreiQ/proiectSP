package work;

public class Autor {

    private String numeAutor;

    public Autor(String numeAutor) {
        this.numeAutor = numeAutor;
    }

    public String getNumeAutor() {
        return numeAutor;
    }

    public void setNumeAutor(String numeAutor) {
        this.numeAutor = numeAutor;
    }

    @Override
    public String toString() {
        return "work.Autor{" +
                "numeAutor='" + numeAutor + '\'' +
                '}';
    }
}
