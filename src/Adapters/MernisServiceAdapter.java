package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;
import mernisReference.DMVKPSPublicSoap;

public class MernisServiceAdapter implements CustomerCheckService {

    @Override
    public boolean CheckIfRealPerson(Customer customer) throws Exception {
        DMVKPSPublicSoap client = new DMVKPSPublicSoap();
        return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(),customer.getDateOfBirth());
    }
}

    /* boolean result = true;

     try{
         result = client.TCKimlikNoDogrula(
                 Long.ParseLong(customer.getNationlityId()),//parse : converts the string types to other data types
                 //for example,we can say Long.parseLong("98989898989") to get the number 98989898989 numerically.
                 customer.getFirstName.toUpperCase(),
                 customer.getLastName.toUpperCase(),
                 customer.getDateOfBirth());
     }
     catch (Exception e){
         result = false;
         System.out.println("error on client");
             e.printStackTrace();
     }
     return result;
     */

//5 keywords are used in exception handling in Java.
//if there is no expected Catch block;
// the exception object is thrown into the line calling the command on which the exception occurred.
//try-catch example is above for this project