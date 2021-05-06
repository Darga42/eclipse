import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Customer senpai=new Customer();
        senpai.setId(1);
        senpai.setFirstName("Tahir");
        senpai.setLastName("Darga");
        senpai.setDateOfBirth(LocalDate.parse("2003-10-29"));
        senpai.setNationalIdentity("1234567");
        BaseCustomerManager base= new StarbucksCustomerManager();
        BaseCustomerManager nero=new NeroCustomerManager();
        nero.delete(senpai);
        base.add(senpai);
        base.getall(senpai);
    
    }

}