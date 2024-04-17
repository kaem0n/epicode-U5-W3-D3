package kaem0n.u5w3d3.Exercise3;

import lombok.Setter;

@Setter
public abstract class SalaryCheck {
    private SalaryCheck next;

    public abstract void check(MilitaryOfficial official);

    public void goNext(MilitaryOfficial official){
        if(next != null) next.check(official);
        else System.out.println("Final check reached. " + official.getName() + " is properly paid for his role.");
    }
}
