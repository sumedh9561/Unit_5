package Problem_1;

public abstract class Animal {

    abstract void eat() throws AnimalException;

    Animal() throws AnimalException {

        try {
            System.out.println("Tiger is eating !!");
        } catch (Exception e) {
            // TODO: handle exception
            AnimalException ie = new AnimalException("invalid data");
        }

    }

}

