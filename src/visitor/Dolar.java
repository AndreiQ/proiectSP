package visitor;

import paragraf.Paragraph;
import work.Image;
import work.Section;
import work.Tabel;

public class Dolar implements VisitorDolar  {
    private int money=0;
    @Override
    public void visitParagraf(Paragraph pg) {
        money+=5;
    }

    @Override
    public void visitTabel(Tabel tb) {
    money+=3;
    }

    @Override
    public void visitImg(Image img2) {
money+=10;
    }
    public void visitSectiune(Section sec) {


        sec.getToateElemente().forEach(c->c.accept(this));


    }

    public void print(){
        System.out.println("money is " + money);

    }

}
