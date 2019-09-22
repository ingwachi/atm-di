package atmwithjdbc;

import org.springframework.dao.DataAccessException;

import java.util.HashMap;

public interface CustomerDao {
    void save(int pin);
    void update(int number, Customer customer);
    void deleteByCustomerNumber(int number);
    Customer findByCustomerNumber(int number);
    HashMap<Integer, Customer> findAll() throws DataAccessException;
}
