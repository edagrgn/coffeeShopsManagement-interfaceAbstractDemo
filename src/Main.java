import Abstract.BaseCustomerManager;
import Abstract.CustomerService;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbuckCustomerManager;
import Entities.Customer;

public class Main {

    public static void main(String[] args) throws Exception {

        Customer customer = new Customer();
        customer.setId(12);
        customer.setFirstName("Eda ");
        customer.setLastName("Gürgen");
        customer.setNationalityId("9999999999");
        customer.setDateOfBirth(1998);

        BaseCustomerManager customerManager = new StarbuckCustomerManager(new MernisServiceAdapter());
        customerManager.save(customer);


        BaseCustomerManager customerManager1 = new NeroCustomerManager(new MernisServiceAdapter());
        customerManager1.save(customer);









    }
}
