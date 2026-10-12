package govtax;
import govidentity.NationalID;

public class TaxService {
    public void ShowTaxServices() {
        new NationalID(). ShowNationalIDServices();
        System.out.println("Tax: tax record opened for CM9001 by URA");
    }
}
