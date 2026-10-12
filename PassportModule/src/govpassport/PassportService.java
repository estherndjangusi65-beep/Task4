package govpassport;
import govidentity.NationalID;

public class PassportService {
    public void ShowPassportServices(){
        new NationalID().ShowNationalIDServices();
        System.out.println("Passport: application accepted for CM9001");
    }
}
