package visitor;

import paragraf.Paragraph;
import work.ImageProxy;
import work.Image;
import work.Section;
import work.Tabel;

public interface VisitorPattInt {
    void visitParagraf(Paragraph pg);
    void visitProxy(ImageProxy img);
    void visitTabel(Tabel tb);
    void visitSectiune(Section sec);
    void visitImg(Image img2);
}
