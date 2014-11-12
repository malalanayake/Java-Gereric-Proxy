package sample.client;

import sample.functor.LogFunctor;
import sample.functor.BiFunctor;
import sample.component.GenericProxyObjectImpl;
import sample.component.GenericRealObjectImpl;
import sample.component.RealObject;

/**
 *
 * @author malalanayake
 */
public class ProxyDemo {

    public static void main(String[] args) {

        /**
         * A :: compute Hello
         *
         * before A :: compute Hello after
         */
        RealObject<String> t = new GenericRealObjectImpl("A");
        t.compute("Hello");

        BiFunctor<String> functor = new LogFunctor<String>();
        t = new GenericProxyObjectImpl<String>(t, functor);
        t.compute("Hello");
    }
}
