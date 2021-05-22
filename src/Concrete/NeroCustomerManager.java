package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {

    private CustomerCheckService _checkService;
    public NeroCustomerManager (CustomerCheckService _checkService){
        this._checkService = _checkService;
    }


    public void save(Customer customer) throws Exception{
        if(_checkService.CheckIfRealPerson(customer)){
            super.save(customer);
        }
        else{
            System.out.println("Not a valid person.");
        }
    }

    private void CheckIfRealPerson(Customer customer) {
    }
}
