package entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
public class PhonkMusic implements Music {
    private String name;

    public String getName() {
        return name;
    }

    public PhonkMusic(String name) {
        this.name = name;
    }

    public void getSong() {
        System.out.println("Music name: "+getName());
    }
}
