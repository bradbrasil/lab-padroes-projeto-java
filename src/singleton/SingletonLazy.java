package singleton;

/* Singleton "preguiçoso"
*
* @author bradbrasil
 */
public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstance() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }

        return instancia;
    }
}
