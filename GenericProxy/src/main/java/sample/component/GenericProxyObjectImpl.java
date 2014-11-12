package sample.component;

import sample.functor.BiFunctor;

/**
 *
 * @author malalanayake
 */
public class GenericProxyObjectImpl<T> implements RealObject<T> {

    RealObject thing;
    BiFunctor<T> functor;

    public GenericProxyObjectImpl(RealObject<T> thing, BiFunctor<T> functor) {
        this.thing = thing;
        this.functor = functor;
    }

    @Override
    public void compute(T name) {
        functor.before(name);
        thing.compute(name);
        functor.after(name);
    }
}
