/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gallonstoliters;

/**
 *
 * @author Lorna
 */
public class GallonsToLiters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double gallons; //holds the number of gallons
        double liters; //holds conversion to liters
        
        gallons = 10; //start value of 10
        liters = gallons * 3.7854; //converts to liters
        
        System.out.println(gallons + " gallons is " + liters + " liters.");
    }
}
