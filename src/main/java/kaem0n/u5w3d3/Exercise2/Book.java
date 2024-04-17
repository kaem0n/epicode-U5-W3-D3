package kaem0n.u5w3d3.Exercise2;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class Book implements PageCounter, PrintElement {
    private final String name;
    private final double price;
    private final List<Author> authors;
    private final List<Section> sections;

    @Override
    public int getNumberOfPages() {
        int numberOfPages = 0;
        for (Section section : this.sections) {
            numberOfPages += section.getNumberOfPages();
        }
        return numberOfPages;
    }

    @Override
    public void print() {
        System.out.println("Printing book " + name + "...");
    }
}
