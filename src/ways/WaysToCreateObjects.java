package ways;

/**
 * Created by Susheel Kumar on 10/15/2021.
 */
public class WaysToCreateObjects {


    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {


        //first by using new keyword
        String s = new String("abc");

        boolean abc = s.equals("abc");
        System.err.println(abc);

        // Java Object Creation by newInstance() method of Class class
        //there should be fully qualified name of class like root directory/package_name/class_name
        Class string = Class.forName("String");
        String objByNewInstance = (String) string.newInstance();

        boolean abc1 = objByNewInstance.equals("abc");
        System.err.println(abc1);

//        Java Object Creation by newInstance() method of Constructor class

        //by clone() method
        //using deserialization

    }


}


