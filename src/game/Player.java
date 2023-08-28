package game;
import java.util.*;

public class Player {
	
	   private Hero hero;
	   private Enemy enemy;
	   private String name;
	   
	 
	    Player(String name){
	    	this.enemy =enemy;
	    	this.hero=hero;
	    	this.name=name;

	    }


		public Hero getHero() {
			return hero;
		}


		public void setHero(Hero hero) {
			this.hero = hero;
		}


		public Enemy getEnemy() {
			return enemy;
		}


		public void setEnemy(Enemy enemy) {
			this.enemy = enemy;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}
		
		public String toString() {
			return "Name:"+ getHero() +"\n" + getEnemy();
		}
	    
	    
	    

	   


	   
	     
	  
}

	  
	  


