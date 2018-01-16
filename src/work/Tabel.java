package work;

import visitor.VisitorDolar;
import visitor.VisitorPattInt;

public class Tabel implements  Element{
    private String tabelName;

    public Tabel(String tabelName) {
        this.tabelName = tabelName;
    }

    public String getTabelName() {
        return tabelName;
    }

    public void setTabelName(String tabelName) {
        this.tabelName = tabelName;
    }

    @Override
    public String toString() {
        return "work.Tabel{" +
                "tabelName='" + tabelName + '\'' +
                '}';
    }


    @Override
    public void print() {
        System.out.println("tabel e " + tabelName);

    }

    @Override
    public void accept(VisitorPattInt obj) {
        obj.visitTabel(this);
    }

    public void accept(VisitorDolar obj){obj.visitTabel(this);}

}
