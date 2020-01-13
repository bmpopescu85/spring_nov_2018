package beans;

public class Human {

    private Dog dog;

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Human{" +
                "dog=" + dog +
                '}';
    }
}
