
public class StarbucksCustomerManager extends BaseCustomerManager{

	@Override
	public void add(Customer customer) {
		System.out.println("Starbucks musteri eklendi : "+customer.getFirstName());
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Starbucks musteri guncellendi : "+customer.getFirstName());
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Starbucks musteri silindi : "+customer.getFirstName());
	}

	@Override
	public void getall(Customer customer) {
		 System.out.println("Starbucks musteri bilgileri guncellendi : "+" "+customer.getFirstName()+" "+customer.getLastName()+" "+customer.getDateOfBirth()+" "+customer.getNationalIdentity());

	}

}
