package game;
import java.util.*;


public class Main {
	
	public static void createCanvas(int canvasSize,int heroPos,int enemyPos) {
	
		int counter =0;
        char[][]canvas = new char[10][10];

        for(char row=0;row<canvas.length;row++){
        	for(char col=0; col<canvas.length;col++) {
        	
        		canvas[row][col]='*';
        		canvas[0][enemyPos]='E';
        		canvas[canvasSize -1][heroPos]='H';
        		canvas[canvasSize -2][heroPos]='$';
        		canvas[canvasSize -3][heroPos]='$';
        		canvas[canvasSize -4][heroPos]='$';
        		canvas[canvasSize -5][heroPos]='$';
        		canvas[canvasSize -6][heroPos]='$';
        		canvas[canvasSize -7][heroPos]='$';
        		canvas[canvasSize -8][heroPos]='$';
        		canvas[canvasSize -9][heroPos]='$';
        		 
        			 
       		     counter+= row +col;
        		System.out.print(canvas[row][col]);
        		
        	}
        	System.out.println();
        	
        }
	}

	public static void main(String[] args) {

		Hero hero =new Hero("SuperMan", "Blue");
		Enemy enemy=new Enemy("SpiderMan","Red",10);
		
		enemy.getHealth();
		System.out.println();
		
		Player player1 =new Player("Hero");
		Player player2 =new Player("Enemy");
		
		player1.setHero(hero);
		player2.setEnemy(enemy);

		System.out.println(player1.getName() + " has a character named " + player1.getHero().getName() + " with color " + player1.getHero().getColor());
		System.out.println(player2.getName() + " has a character named " + player2.getEnemy().getName() + " with color " + player2.getEnemy().getColor() + " And health of  " + player2.getEnemy().getHealth());		
	
		int canvasSize=10;
		int heroPos =0;
		
	
		while(true) {
			Scanner s =new Scanner(System.in);
			int enemyPos =(int)Math.floor(Math.random()*canvasSize);
			
			if(enemyPos == heroPos) {
				player2.getEnemy().reduceHealth();
				System.out.println("The enemy has been hit!!!!");
			
			}
			
			 createCanvas(canvasSize, heroPos,enemyPos);
			 if(enemy.getHealth()==0) break;
			
			System.out.print("What direction do you want to move:");
			String move =s.nextLine();
			
			if(move.toLowerCase().charAt(0)=='l') {
				heroPos -=1;
				if(heroPos<0) heroPos=0;
			}
			
			if(move.toLowerCase().charAt(0) =='r') {
				heroPos+=1;
				if(heroPos ==canvasSize) heroPos =canvasSize-1;
				
			}
		
		}
	

    }
	}


