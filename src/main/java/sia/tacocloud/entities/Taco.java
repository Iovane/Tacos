package sia.tacocloud.entities;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@Component
public class Taco {

    @NotNull
    @Size(min = 5, message = "Name must be at least 5 characters long.")
    private String name;

    @NotNull
    @Size(min = 1, message = "Must choose at least 1 ingredient")
    private List<Ingredient> ingredients;
}
