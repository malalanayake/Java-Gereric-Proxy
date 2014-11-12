package sample.component;

/**
 *
 * @author malalanayake
 */
public class GenericRealObjectImpl<T> implements RealObject<T> {

    T name;

    public GenericRealObjectImpl(T name) {
        this.name = name;
    }

    @Override
    public void compute(T name) {
        System.out.println(this.name + " compute " + name);
    }
}
