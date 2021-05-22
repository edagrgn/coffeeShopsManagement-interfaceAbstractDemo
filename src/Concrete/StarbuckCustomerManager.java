package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbuckCustomerManager extends BaseCustomerManager {


    private CustomerCheckService _customerCheckService;

    public StarbuckCustomerManager(CustomerCheckService customerCheckService) {
        _customerCheckService = customerCheckService;
    }

    public void save(Customer customer) throws Exception {

        if(_customerCheckService.CheckIfRealPerson(customer)){
            super.save(customer);
        }
        else {
            System.out.println("Not a valid person.");
        }

    }

    private void CheckIfRealPerson(Customer customer) {
    }
}
