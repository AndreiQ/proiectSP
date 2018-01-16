package main;

import paragraf.Paragraph;
import visitor.Dolar;
import work.Image;
import work.Section;
import work.Tabel;

public class MainClass {

    public static void main(String[] args) {
/*
        List<Autor> autori = new ArrayList<Autor>();
        autori.add(new Autor("autor1"));

        Section sectiunea1 = new Section("Sectiunea1");

        sectiunea1.addElement(new ImageProxy("imagine"));
        sectiunea1.addElement(new Tabel("tabel"));
        Paragraph p1=new Paragraph().setText("paragraful1");

        CenterAlign center= new CenterAlign();
        LeftAlign left= new LeftAlign();

        RightAlign right= new RightAlign();
        p1.setAlign(left);
        sectiunea1.addElement(p1);
        p1.print();

        Carte carte = new Carte("work.Carte",new Cuprins("cuprins"),autori);

        carte.addElement(sectiunea1);

        Numarator no= new Numarator();
        sectiunea1.accept(no);
        p1.accept(no);


        carte.print();
        System.out.println("vizitate " + no);


     Builder builder = new JSONBuilder("F:\\JavaProjects\\carte\\src\\main\\book.json").buildPart();

     Element book = builder.getResult();
     book.print();
*/

Section sec = new Section("sectiunea2");
sec.addElement(new Tabel("gigi"));
sec.addElement(new Image("maria"));
        sec.addElement(new Image("irina"));
sec.addElement(new Paragraph().setText("paragraf1"));
        Dolar no= new Dolar();
sec.accept(no);
no.print();


    }
}
