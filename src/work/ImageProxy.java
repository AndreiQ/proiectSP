package work;

import visitor.VisitorDolar;
import visitor.VisitorPattInt;

public class ImageProxy implements Element {

    private String url;
    private Image img=null;

    public ImageProxy(String url) {
        this.url = url;
    }

    public void print(){
        if(img==null)
            img=new Image(url);
        img.print();


    }

    @Override
    public void accept(VisitorPattInt obj) {
        obj.visitProxy(this);
    }

    @Override
    public void accept(VisitorDolar obj) {

    }

}
