package entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
public class ClassicMusic implements Music {
    private String name;

    public ClassicMusic(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    @Override
    public void getSong() {
        System.out.println("Music name: "+getName());
    }
}
