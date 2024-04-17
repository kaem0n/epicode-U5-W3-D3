package kaem0n.u5w3d3.Exercise3;

public class OverpaymentCheck extends SalaryCheck {
    @Override
    public void check(MilitaryOfficial official) {
        switch (official.getRole()) {
            case LIUTENANT -> {
                if (official.getSalary() > 2000) System.err.println(official.getName() + " is overpaid (maximum salary: 2000€)");
                else goNext(official);
            }
            case CAPTAIN -> {
                if (official.getSalary() > 3000) System.err.println(official.getName() + " is overpaid (maximum salary: 3000€)");
                else goNext(official);
            }
            case MAJOR -> {
                if (official.getSalary() > 4000) System.err.println(official.getName() + " is overpaid (maximum salary: 4000€)");
                else goNext(official);
            }
            case COLONEL -> {
                if (official.getSalary() > 5000) System.err.println(official.getName() + " is overpaid (maximum salary: 5000€)");
                else goNext(official);
            }
            case GENERAL -> {
                if (official.getSalary() > 6000) System.err.println(official.getName() + " is overpaid (maximum salary: 6000€)");
                else goNext(official);
            }
        }
    }
}
