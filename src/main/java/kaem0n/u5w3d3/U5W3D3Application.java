package kaem0n.u5w3d3;

import kaem0n.u5w3d3.Exercise1.Info;
import kaem0n.u5w3d3.Exercise1.InfoAdapter;
import kaem0n.u5w3d3.Exercise1.UserData;
import kaem0n.u5w3d3.Exercise2.*;
import kaem0n.u5w3d3.Exercise3.Hierarchy;
import kaem0n.u5w3d3.Exercise3.MilitaryOfficial;
import kaem0n.u5w3d3.Exercise3.OverpaymentCheck;
import kaem0n.u5w3d3.Exercise3.UnderpaymentCheck;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class U5W3D3Application {

	public static void main(String[] args) {
		SpringApplication.run(U5W3D3Application.class, args);

		System.out.println();
		System.out.println("==== EXERCISE 1 ====");
		UserData ud = new UserData();
		Info info = new Info("Mario", "Rossi", LocalDate.parse("1990-01-01"));

		ud.getData(new InfoAdapter(info));

		System.out.println();
		System.out.println("==== EXERCISE 2 ====");
		Page page1 = new Page(1, "something something content yeah");
		Page page2 = new Page(2, "something something content yeah");
		Page page3 = new Page(3, "something something content yeah");
		Page page4 = new Page(4, "something something content yeah");
		Page page5 = new Page(5, "something something content yeah");
		Page page6 = new Page(6, "something something content yeah");
		Page page7 = new Page(7, "something something content yeah");
		Page page8 = new Page(8, "something something content yeah");
		Page page9 = new Page(9, "something something content yeah");
		Page page10 = new Page(10, "something something content yeah");
		Section sec1 = new Section("section1", List.of(page1, page2, page3));
		Subsection sub1 = new Subsection("sub1", List.of(page4, page5, page6));
		Section sec2 = new Section("section2", List.of(page7, page8, page9), List.of(sub1));
		Subsection sub2 = new Subsection("sub2", List.of(new Page(11, "xddd"), new Page(12, "asdasd")));
		Subsection sub3 = new Subsection("sub2", List.of(new Page(13, "lmao"), new Page(14, "asdone")));
		Section sec3 = new Section("section3", List.of(page10), List.of(sub2, sub3));
		Section sec4 = new Section("section4", List.of(new Page(15, "finishhhh")));
		Author author1 = new Author("Mary Reds");
		Author author2 = new Author("Francis Brown");
		Book book = new Book("Random Book Title", 10.99, List.of(author1, author2), List.of(sec1, sec2, sec3, sec4));

		System.out.println("Book '" + book.getName() + "' has " + book.getNumberOfPages() + " pages.");
		book.print();
		page3.print();
		sub2.print();
		sec4.print();

		System.out.println();
		System.out.println("==== EXERCISE 3 ====");
		MilitaryOfficial liutenant1 = new MilitaryOfficial("Giovanni Neri", 2300, Hierarchy.LIUTENANT);
		MilitaryOfficial liutenant2 = new MilitaryOfficial("Carlo Bruni", 900, Hierarchy.LIUTENANT);
		MilitaryOfficial liutenant3 = new MilitaryOfficial("Marco Verdi", 1200, Hierarchy.LIUTENANT);
		UnderpaymentCheck firstCheck = new UnderpaymentCheck();
		OverpaymentCheck secondCheck = new OverpaymentCheck();
		firstCheck.setNext(secondCheck);

		firstCheck.check(liutenant1);
		firstCheck.check(liutenant2);
		firstCheck.check(liutenant3);
	}

}
