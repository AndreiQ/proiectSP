package paragraf;

import paragraf.AlignStrategy;

public class CenterAlign implements AlignStrategy {
    @Override
    public void print(String text) {
        System.out.println("******"+ text + "*****");

    }
}
