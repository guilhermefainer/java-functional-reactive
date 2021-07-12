package section14;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Movie {
    private String name;
    private int releaseYear;
    private String industry;
}
