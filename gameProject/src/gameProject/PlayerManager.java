package gameProject;

import java.time.LocalDate;

public class PlayerManager implements PlayerService {
	
	PlayerCheckManager checkManager;

	public PlayerManager(PlayerCheckManager checkManager) {
		this.checkManager = checkManager;
	}

	@Override
	public void register(Player player) {
		if(checkManager.checkPlayer(player)) {
			System.out.println("-------------------------------------------");
			System.out.println("Kimlik Doğrulaması Başarılı !");
			System.out.println("!! Oyuncu Başarılı Bir Şekilde Sisteme Kayıt Edilmiştir!!");
			System.out.println("Oyuncu Adı: " + player.getFirstName() + " " + player.getLastName() );
			System.out.println("Oyuncunun Yaşı: " + LocalDate.now().getYear()  );
			System.out.println("-------------------------------------------");
		}else {
			//System.out.println("-------------------------------------------");
			System.out.println("Kimlik Kontrol İşlemi Başarısız!!!");
			//System.out.println("-------------------------------------------");
		}
		
	}

	@Override
	public void delete(Player player) {
		System.out.println("-------------------------------------------");
		System.out.println("Oyuncu Silinmiştir: " + player.getFirstName() + " " + player.getLastName());
		//System.out.println("-------------------------------------------");
		
	}

	@Override
	public void update(Player player,String name ,String lasName,String nationalIdentity,String dateOfBirth) {
		System.out.println("-------------------------------------------");
		if(name != null) {
			player.setFirstName(name);
			System.out.println("İsim Başarıyla Güncellenmiştir: " + player.getFirstName());
		}else if(lasName != null) {
			player.setLastName(lasName);
			System.out.println("Soyisim Başarıyla Güncellenmiştir: " + player.getLastName());
		}else if(nationalIdentity != null) {
			player.setNationalIdentity(nationalIdentity);
			System.out.println("TC Kimlik No Başarıyla Güncellenmiştir: " + player.getNationalIdentity());
		}else if(dateOfBirth != null) {
			player.setDateOfBirth(dateOfBirth);
			System.out.println("Doğum Tarihi Başarıyla Güncellenmiştir: " + player.getDateOfBirth());
		}
		System.out.println("-------------------------------------------");
	}

}