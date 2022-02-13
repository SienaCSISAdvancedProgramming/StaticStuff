/**
 * Example StaticStuff: demonstrating static vs. non-static
 * variables and methods
 *
 * @author Jim Teresco
 * The College of Saint Rose, CSC 252, Spring 2014
 * Siena College, CSIS 225, Spring 2020
 * @version Spring 2022
 */

public class StaticStuff {
    
    // a class variable
    private static int classVar;
    
    // an instance variable
    private int instanceVar;

    /**
       Example constructor, just stores the values of its parameters
       in the instance variable and class variable.

       @param x the value to store in the class variable classVar
       @param y the value to store in the instance variable instanceVar
    */
    public StaticStuff(int x, int y) {
        
        classVar = x;
        instanceVar = y;
        
    }
    
    /**
       Generate a String containing the values of the class and
       instance variables.

       @return  a String containing the values of the class and instance vatiables
    */
    public String toString() {
        
        return "classVar is " + classVar + ", instanceVar is " + instanceVar;
    }
    
    /**
       Main method to demonstrate the difference between the class
       variable and the instance variable.

       @param args not used
    */
    public static void main(String[] args) {
    
        // I can access my class variable here, even in a 
        // static method.
        classVar = 10;
        
        // But I can't access the instance variable, because
        // there is no instance of the class available
        // in this static method.
        //instanceVar = 20;
        
        // print out our class variable
        System.out.println("classVar is " + classVar);
        
        // so let's create an instance of this class
        StaticStuff first = new StaticStuff(17, 23);
        System.out.println("classVar is " + classVar);
        System.out.println("first: " + first);
        
        // and another instance of this class
        StaticStuff second = new StaticStuff(12, 15);
        System.out.println("classVar is " + classVar);
        System.out.println("first: " + first);
        System.out.println("second: " + second);
        
    }
}
