package work;

import visitor.VisitorDolar;
import visitor.VisitorPattInt;

public interface  Element {

void print();
    void accept(VisitorPattInt obj);
    void accept(VisitorDolar obj);


}
