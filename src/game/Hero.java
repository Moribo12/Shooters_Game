package game;

public class Hero {
	//private Player player;
	private String name;
	private String color;
	
	public Hero(){
		
	}
	
    public Hero(String name, String color){
    	this.name =name;
    	this.color =color;	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	/*public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}*/
	
	

}
