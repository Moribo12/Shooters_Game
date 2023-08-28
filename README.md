# Shooters_Game
a shooter game where you have a hero and enemies on the other both ends of the canvas _(can be any environment, space or anything).

The game will play using a time interval which in your case will be a loop, and in each iteration the enemy will move to any apply Horizontally and the hero will always be shooting being controlled by the User as to whether to move from left to right.

For each of the players (hero + enemy) 
- BOTH must have a name
- Both must have color 
- ONLY enemy must have [health] set to 10 in the beginning 

FOR EACH ENEMY HIT, The enemy must lose 5 points. And die when health reaches 0. 

*NB:* 
The Enemy must be represented as E.
The Hero must be represented as H
The missile must be represented as $
The environment must be represented as * and must have a size of 10.

PLAYER DIRECTIONS:

LEFT represented as L
RIGHT represented as R

It should work for either lower or upper case.

I have used a 2D array to create the canvas/playing environment.
