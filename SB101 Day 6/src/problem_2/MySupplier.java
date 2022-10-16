package problem_2;

import java.util.function.Supplier;

public class MySupplier implements Supplier {

    @Override
    public Object get() {

        return new Student (203,"Komal",300);
    }

}

