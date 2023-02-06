package entity;

public class PopMusic implements Music{
    private String name;

    public String getName() {
        return name;
    }

    public PopMusic(String name) {
        this.name = name;
    }

    @Override
    public void getSong() {
        System.out.println("Music name: "+getName());
    }
}
