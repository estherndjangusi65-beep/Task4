package govapplication;
import java.util.Scanner;
import govidentity.NationalID;
import govtax.TaxService;
import govpassport.PassportService;
import govbusiness.BusinessService;

public class Main {
    public static void main(String[] args){
        System.out.println("Uganda e-Government Platform");
    new NationalID() .ShowNationalIDServices();
    new TaxService() .ShowTaxServices();
    new PassportService() . ShowPassportServices();
    new BusinessService() . ShowBusinessServices();
    }
}
