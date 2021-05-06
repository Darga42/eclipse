package gameProject;

public class Main {

	public static void main(String[] args) {
		
		Player player = new Player();
		player.setFirstName("Tahir");
		player.setLastName("Darga");
		player.setDateOfBirth("2003");
		player.setNationalIdentity("19216801");
		
		PlayerManager playerManager = new PlayerManager( new PlayerCheckManager());
		playerManager.register(player);
		playerManager.delete(player);
		playerManager.update(player, "Ali", null,null, null);
		
		GameSale game = new GameSale();
		game.setGameId(1);
		game.setGameName("ETS 2 ");
		game.setPrice(50);
		game.setGameDescription("\nTır Simülasyon Oyunu \nFiyati: " + game.getGamePrice());
		
		GameSaleManager gameManager = new GameSaleManager();
		gameManager.seeGame(game);
		gameManager.buyGame(player, game);
		
		Campaign campaing = new Campaign();
		campaing.setCampaingId(1);
		campaing.setCampaignName("Yaz İndirimleri");
		campaing.setCampaingDiscount(10);
		
		CampaignManager campaingManager = new CampaignManager(DiscountService.discountManager(game, campaing));
		campaingManager.addCampaign(game, campaing);
		campaingManager.updateCampaign(campaing, null, 12);
		campaingManager.deleteCampaign(game, campaing);
		campaingManager.discount(game, campaing);
		

	}

}