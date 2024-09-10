
package cafe;

/**
 * interface class Bill
 * in this class some method we will may need in other class
 * @author Donia
 */
public interface InterfaceBill {
  /**
   * constant s_price The service price will be added to the bill
   */
    double sprice = 20; 

    public String informaionBill();

    public String printAllDish();

    public double sumOfBill();
}
