package repositories;

import javax.inject.Named;

@Named
public class HelloRepository {

    public void save() {
        System.out.println("Save");
    }
}
