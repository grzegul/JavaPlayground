package rozdzial10;

interface Game{
	boolean toss();
}
interface GameFactory{
	Game getGame();
}

class Coin implements Game{
	private int toss = 0;
	private static final int TOSS = 5;
	public boolean toss(){
		System.out.println("Rzut monet¹: " + toss);
		return ++toss != TOSS;
	}
	public static GameFactory factory = new GameFactory(){
		public Game getGame(){
			return new Coin();
		}
	};
}

class Dice implements Game{
	private int toss = 0;
	private static final int TOSS = 3;
	public boolean toss(){
		System.out.println("Rzut koœci¹: " + toss);
		return ++toss != TOSS;
	}
	public static GameFactory factory = new GameFactory(){
		public Game getGame(){
			return new Dice();
		}
	};
}

public class Cw17 {
	public static void playGame(GameFactory f){
		Game g = f.getGame();
		while(g.toss());
	}
	public static void main(String[] args) {
		playGame(Coin.factory);
		playGame(Dice.factory);
	}

}
