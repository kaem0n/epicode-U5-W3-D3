package kaem0n.u5w3d3.Exercise1;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class UserData {
    private String completeName;
    private int age;

    public void getData(DataSource ds) {
        this.completeName = ds.getCompleteName();
        this.age = ds.getAge();
        System.out.println("Hello, my name is " + completeName + " and I'm " + age + " years old.");
    }
}
