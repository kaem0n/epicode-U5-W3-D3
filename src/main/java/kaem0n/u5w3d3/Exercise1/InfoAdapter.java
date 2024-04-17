package kaem0n.u5w3d3.Exercise1;

import lombok.AllArgsConstructor;

import java.time.LocalDate;
import java.time.Period;

@AllArgsConstructor
public class InfoAdapter implements DataSource {
    private Info info;

    @Override
    public String getCompleteName() {
        return info.getName() + " " + info.getSurname();
    }

    @Override
    public int getAge() {
        return Period.between(info.getBirthday(), LocalDate.now()).getYears();
    }
}
