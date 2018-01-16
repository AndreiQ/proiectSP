package visitor;

import paragraf.Paragraph;
import work.Image;
import work.Section;
import work.Tabel;

public interface VisitorDolar {

    void visitParagraf(Paragraph pg);
    void visitTabel(Tabel tb);
    void visitImg(Image img2);
    void visitSectiune(Section sec);
}
