package gameProject;

public class GameSaleManager implements GameService {
	
	public GameSaleManager() {
		System.out.println("          Oyun Satış Mağazasına Hoşgeldiniz          ");
	}
	
	@Override
	public void seeGame(GameSale gameSale) {
		System.out.println(gameSale.getGameName() + " Oyunun Ayrıntıları: " + gameSale.getGameDescription());
	}

	@Override
	public void buyGame(Player player,GameSale gameSale) {
		System.out.println("------------------------------------------------------------");
		System.out.println(player.getFirstName() + " " + player.getLastName() + " oyuncusu " + gameSale.getGameName() + " Satın Almıştır ");
		System.out.println("------------------------------------------------------------");
	}

	

}	