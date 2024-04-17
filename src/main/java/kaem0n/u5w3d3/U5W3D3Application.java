package kaem0n.u5w3d3;

import kaem0n.u5w3d3.Exercise1.Info;
import kaem0n.u5w3d3.Exercise1.InfoAdapter;
import kaem0n.u5w3d3.Exercise1.UserData;
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
	}

}
