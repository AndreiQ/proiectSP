package work;

import visitor.VisitorDolar;
import visitor.VisitorPattInt;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element {

    private String titlu;
    private List<Element> continut= new ArrayList<>();




    public Section(String titlu) {
        this.titlu = titlu;
    }

    public void addElement(Element e){
        continut.add(e);

    }

public List<Element> getToateElemente(){
    return continut;
}



    @Override
    public void print(){
        System.out.println("sectiune " + titlu);
        for(Element e: continut){
            e.print();
        }

    }

    @Override
    public void accept(VisitorPattInt obj) {
        obj.visitSectiune(this);
    }


  public void accept(VisitorDolar obj){obj.visitSectiune(this);}
}
