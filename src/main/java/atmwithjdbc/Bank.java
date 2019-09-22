package atmwithjdbc;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * A bank contains customers with bank accounts.
 */
public class Bank {

   private Map<Integer, Customer> customers;
   private CustomerDao customerDao;

   /**
    * Constructs a bank with no customers.
    */
   public Bank(CustomerDao customerDao) {
      this.customerDao = customerDao;
      customers = new HashMap<Integer, Customer>();
   }

   public void initializeCustomers() throws IOException {
      customers = customerDao.findAll();
   }
   /**
    * Adds a customer to the bank.
    * @param c the customer to add
    */
   public void addCustomer(Customer c) {
      customers.put(c.getCustomerNumber(), c);
   }
   
   /** 
    * Finds a customer in the bank.
    * @param number a customer number
    * @return the matching customer, or null if no customer
    * matches
    */
   public Customer findCustomer(int number) {
	  return customers.get(number);
   }
}
