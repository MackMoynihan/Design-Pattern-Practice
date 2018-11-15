/**
 * Singleton is an object that only allows one instance to be
 * made. It holds an instance of itself and uses a private
 * constructor to control the number of instances allowed.
 * To access this object use the getInstance method.
 *
 *
 *
 * @author      Mack Moynihan
 * @version     1.0
 * @since       11/14/2018
 */
public class Singleton {
    /**
     * The instance is used to track if an instance already exists.
     */
    private static Singleton instance;
    /**
     * Private class constructor to resticts object instantiation
     */
    private Singleton(){}
    /**
     * Allows the client to get an instance of the class and checks if one
     * exists already.
     */
    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
