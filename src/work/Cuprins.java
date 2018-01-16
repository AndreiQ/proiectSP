package work;

public class Cuprins {

    private String nameCuprins;

    public Cuprins(String nameCuprins) {
        this.nameCuprins = nameCuprins;
    }

    public String getNameCuprins() {
        return nameCuprins;
    }

    public void setNameCuprins(String nameCuprins) {
        this.nameCuprins = nameCuprins;
    }

    @Override
    public String toString() {
        return "work.Cuprins{" +
                "nameCuprins='" + nameCuprins + '\'' +
                '}';
    }
}
