/**
 * SingletonPatternDemo is a driver class for the Singleton class.
 * This simple creates a Singleton object and then compares
 * them using the equals method.
 *
 *
 *
 * @author      Mack Moynihan
 * @version     1.0
 * @since       11/14/2018
 */
public class SingletonPatternDemo{
    public static void main(String[] args){
        // Try to create two Singleton objects.
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        // Use the equals method to check if they are the
        // same instance.
        testInstanceEquality(instance1, instance2);
    }

    /**
     * Outputs the equality between two instances of the Singleton class.
     *
     * @param inst1 One instance of the Singleton class
     * @param inst2 Another instance of the Singleton class
     * @see Singleton
     */
    public static void testInstanceEquality(Singleton inst1, Singleton inst2){
        if (inst1.equals(inst2)){
            System.out.println("EQUAL");
        } else {
            System.out.println("NOT EQUAL");
        }
    }
}
