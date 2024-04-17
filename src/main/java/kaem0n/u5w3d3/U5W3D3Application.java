package kaem0n.u5w3d3;

import kaem0n.u5w3d3.Exercise1.Info;
import kaem0n.u5w3d3.Exercise1.InfoAdapter;
import kaem0n.u5w3d3.Exercise1.UserData;
import kaem0n.u5w3d3.Exercise3.Hierarchy;
import kaem0n.u5w3d3.Exercise3.MilitaryOfficial;
import kaem0n.u5w3d3.Exercise3.OverpaymentCheck;
import kaem0n.u5w3d3.Exercise3.UnderpaymentCheck;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

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
