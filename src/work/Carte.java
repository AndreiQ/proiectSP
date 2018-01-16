package work;

import java.util.ArrayList;
import java.util.List;

public class Carte {
    private String titlu;
    private Cuprins cuprinsName;
    private List<Autor> autorList;

    private List<Element> continut = new ArrayList<>();

    public Carte(String titlu, Cuprins cuprinsName, List<Autor> autorList) {
        this.titlu = titlu;
        this.cuprinsName = cuprinsName;
        this.autorList = autorList;

    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public void setCuprinsName(Cuprins cuprinsName) {
        this.cuprinsName = cuprinsName;
    }

    public void setAutorList(List<Autor> autorList) {
        this.autorList = autorList;
    }

    public String getTitlu() {
        return titlu;
    }

    public Cuprins getCuprinsName() {
        return cuprinsName;
    }

    public List<Autor> getAutorList() {
        return autorList;
    }


    public void print(){
        for(Element e:continut)
           e.print();

    }

    public void addElement(Element e){
        continut.add(e);
    }
    @Override
    public String toString() {
        return "work.Carte{" +
                "titlu='" + titlu + '\'' +
                ", cuprinsName=" + cuprinsName +
                ", autorList=" + autorList
                ;
    }
}
