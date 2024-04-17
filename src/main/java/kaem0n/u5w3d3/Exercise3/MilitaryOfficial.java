package kaem0n.u5w3d3.Exercise3;

import lombok.Getter;

@Getter
public class MilitaryOfficial {
    public String name;
    public int salary;
    public Hierarchy role;

    public MilitaryOfficial(String name, int salary, Hierarchy role) {
        this.name = name;
        this.salary = salary;
        this.role = role;
    }
}
