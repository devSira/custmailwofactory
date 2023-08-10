/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customermailapplication;

/**
 *
 * @author Siraphob.B
 */
public class CustomerFactory {
    public static Customer createCustomer(String type) {
        if (type.equals("1")) 
            return new RegularCustomer();
	else if (type.equals("2"))
            return new MountainCustomer();
        else if (type.equals("3"))
            return new DelinquentCustomer();
	return null;
    }
}
