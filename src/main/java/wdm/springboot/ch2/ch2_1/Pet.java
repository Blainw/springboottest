package wdm.example.ch2;

public class Pet {
    private String breed;
    private String  name;

    public Pet(String breed, String name) {

        this.breed = breed;
        this.name = name;
    }

    public Pet() {
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
