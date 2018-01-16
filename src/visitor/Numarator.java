package visitor;

import paragraf.Paragraph;
import work.*;

public class Numarator implements VisitorPattInt{
    private int contor=0;

    @Override
    public void visitParagraf(Paragraph pg) {
    }

    @Override
    public void visitProxy(ImageProxy img) {
contor++;
    }

    @Override
    public void visitTabel(Tabel tb) {
contor++;
    }

    @Override
    public void visitSectiune(Section sec) {
      contor++;

sec.getToateElemente().forEach(c->c.accept(this));


    }

    @Override
    public void visitImg(Image img2) {
        contor++;
    }

    public int getContor(){
        return contor;

    }

    @Override
    public String toString() {
        return "Numarator{" +
                "contor=" + contor +
                '}';
    }
}
