package kaem0n.u5w3d3.Exercise1;

import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
@Setter
public class Info {
    private String name;
    private String surname;
    private LocalDate birthday;
}
