package game;

public class Enemy {
	private String name;
	private String color;
	private int health;
	final int SCORE =5;
	

	Enemy() {	
	}
	 
	 Enemy(String name, String color,int health) {	
		 this.name=name;
		 this.color=color;
		 this.health=health;
		 
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

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	public void reduceHealth() {
		
		if(health <SCORE) {
			System.out.println("Enemy is dead");
		}else {
			health -=SCORE;
			
			
		}
		
			
			
		}

	}

	 

