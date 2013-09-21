/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gallons.to.liters;

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
        double gallons; //variable for the number of gallons
        double liters;  //variable for the number of liters
        
        gallons = 10;  //begin with 10 gallons
        liters = gallons * 3.7854; //convert to liters
        System.out.println(gallons + " gallons is " + liters + " liters.");
    }
}
