package paragraf;

import visitor.VisitorDolar;
import visitor.VisitorPattInt;
import work.Element;

public class Paragraph implements Element {

    private String text;
    private AlignStrategy objStrategy;



   public void setAlign(AlignStrategy obj){
    objStrategy=obj;

   }


    @Override
    public void print() {
       if (objStrategy !=null)
       objStrategy.print(text);

       else
           System.out.println(text);
    }

    @Override
    public void accept(VisitorPattInt obj) {
        obj.visitParagraf(this);
    }
    public void accept(VisitorDolar obj){obj.visitParagraf(this);}

    public String getText() {
        return text;
    }

    public Paragraph setText(String text) {
        this.text = text;
        return this;
    }
}
