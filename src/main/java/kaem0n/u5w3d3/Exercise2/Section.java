package kaem0n.u5w3d3.Exercise2;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
public class Section extends Subsection {
    private List<Subsection> subsections;

    public Section(String name, List<Page> pages, List<Subsection> subsections) {
        super(name, pages);
        this.subsections = subsections;
    }

    public Section(String name, List<Page> pages) {
        super(name, pages);
    }

    @Override
    public int getNumberOfPages() {
        int numberOfPages = 0;
        if (this.subsections != null) {
            for (Subsection subsection : this.subsections) {
                numberOfPages += subsection.getNumberOfPages();
            }
        }
        numberOfPages += this.pages.size();
        return numberOfPages;
    }

    @Override
    public void print() {
        System.out.println("Printing section " + name + "...");
    }
}
