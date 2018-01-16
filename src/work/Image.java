package work;

import visitor.VisitorDolar;
import visitor.VisitorPattInt;

public class Image implements Element{

private String url;

    public Image(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }



    @Override
    public void print() {
        System.out.println("image name is " + url);
    }

    @Override
    public void accept(VisitorPattInt obj) {
        obj.visitImg(this);
    }

    public void accept(VisitorDolar obj){obj.visitImg(this);}
}
