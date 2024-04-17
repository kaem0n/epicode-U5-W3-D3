package kaem0n.u5w3d3.Exercise2;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Page implements PrintElement{
    private int pageNumber;
    private String text;

    @Override
    public void print() {
        System.out.println("Printing page number " + pageNumber + "...");
    }
}
