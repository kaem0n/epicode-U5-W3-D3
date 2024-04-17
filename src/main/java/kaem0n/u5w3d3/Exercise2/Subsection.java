package kaem0n.u5w3d3.Exercise2;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class Subsection implements PageCounter, PrintElement {
    protected final String name;
    protected final List<Page> pages;

    @Override
    public int getNumberOfPages() {
        return pages.size();
    }

    @Override
    public void print() {
        System.out.println("Printing subsection " + name + "...");
    }
}
