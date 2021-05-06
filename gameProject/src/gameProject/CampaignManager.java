package gameProject;

public class CampaignManager implements CampaignService {
	
	double discountService;
	
	public CampaignManager(double discountService) {
		this.discountService = discountService;
	}

	@Override
	public void addCampaign(GameSale gameSale, Campaign campaing) {
		System.out.println("-------------------------------------------");
		System.out.println(gameSale.getGameName() + " İsimli Oyuna " + campaing.getCampaignName() + " Kampanyası Getirilmiştir");
		System.out.println("-------------------------------------------");
		
	}

	@Override
	public void deleteCampaign(GameSale gameSale, Campaign campaing) {
		System.out.println("-------------------------------------------");
		System.out.println(gameSale.getGameName() + " İsimli Oyundan " + campaing.getCampaignName() + " İndirimi Kampanyası Kaldırılmıştır !");
		System.out.println("-------------------------------------------");
		
		
	}

	@Override
	public void updateCampaign(Campaign campaing,String campaignName,double campaingDiscount) {
		if(campaignName != null) {
			campaing.setCampaignName(campaignName);
			System.out.println("İndirim Kampanya Adı Güncellendi: " + campaing.getCampaignName());
		}else if(campaingDiscount != 0) {
			campaing.setCampaingDiscount(campaingDiscount);
			System.out.println("Kampanyanın İndirim Oranı Güncellendi: " + campaing.getCampaingDiscount());
		}
	}

	@Override
	public void discount(GameSale gameSale, Campaign campaing) {
		System.out.println(gameSale.getGameName() + " Oyununa " + campaing.getCampaignName() + " İndirim Kampanyası Uygulanarak Yeni Fiyati: " + this.discountService );
		
	}

}