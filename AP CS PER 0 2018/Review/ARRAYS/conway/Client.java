package ARRAYS.conway;

public class Client {
	public static void main(String[] args) {
		Life game = new Life();

		game.fillBoard();
		game.display(0);
		for(int j = 0; j < 5; j++) {
			game.update();
			game.display(j+1);
			System.out.println();
		}

	}
}

/*
Gen 0: Number of Bacteria --100
 12345678901234567890
1 XX XX         X   X
2 X   X          X XX
3X    XX X X     X  X
4   XX  X  X       XX
5X     X      X   X  
6  XX   X   X X    X 
7     X     X X  X   
8X    XXX   X  XX   X
9X       XX  X     X 
0X X            X   X
1 X X     X XX       
2      X  XXX X  X   
3              X X  X
4X     X  XX   X  XX 
5  X  X              
6            XX      
7    XXX          XX 
8 X         X  X     
9XXXX X X     X      
0    X  X    XX     X
Bacteria in 10th row:4
Bacteria in 10th column:4
Gen 1: Number of Bacteria --107
 12345678901234567890
1 XX XX            XX
2XXX            XXXXX
3     XXX X          
4    X  X X       XXX
5  X X XX    X    X X
6      X      XX  X  
7    XX X  XX X X    
8     XXXX XX XXX    
9X     XXX     XX  XX
0X X     XXXXX       
1 XX      X XX       
2         X X X X    
3           X XX X X 
4               X XX 
5             X      
6    X X             
7     X      XX      
8XX X                
9XXXXX X      XX     
0 XXXX X     XX      
Bacteria in 10th row:7
Bacteria in 10th column:5

Gen 2: Number of Bacteria --88
 12345678901234567890
1X XX            X  X
2X XXX           XX X
3 X   XXX            
4   XX            X X
5   X  XXX    X  XX X
6   XX      X XX X X 
7    X   XXXX   XX   
8    X     XX X  X   
9 X   X         X    
0X X         XX      
1 XX          X      
2           X X X    
3          X  X  X X 
4            XX XXXX 
5                    
6     X      XX      
7    XX              
8X  X X      X X     
9            XXX     
0X   X       XXX     
Bacteria in 10th row:4
Bacteria in 10th column:1

Gen 3: Number of Bacteria --88
 12345678901234567890
1  X X           XXX 
2X   XXX         XXX 
3 X   XX         XX  
4  XXX   X       XX  
5  X  X X    XXXXX  X
6   XXX     X XX   X 
7    XX   X   X  X   
8    XX     XX X X   
9 X         X XX     
0X X         XXX     
1 XX          X      
2             X      
3           X X    X 
4            XXXXX X 
5              X XX  
6    XX              
7     XX     X       
8     X      X X     
9    X      X   X    
0            X X     
Bacteria in 10th row:5
Bacteria in 10th column:1

Gen 4: Number of Bacteria --71
 12345678901234567890
1   XX           X X 
2 X XX X        X    
3 XX   XX       X    
4 XXXX  X     XX   X 
5  X  XX     X   X X 
6   X            XX  
7      X   XX     X  
8    XX    XX  X     
9 X         X        
0X X                 
1 XX                 
2             XX     
3               X X  
4            X   X X 
5              X XX  
6    XXX             
7      X      X      
8    XXX    XXX      
9           XX XX    
0                    
Bacteria in 10th row:2
Bacteria in 10th column:0

Gen 5: Number of Bacteria --68
 12345678901234567890
1  XXXX              
2 X  X XX       XX   
3X     XX       X    
4    X  X     XXX X  
5 X   XX      X XX X 
6     XX    X    X X 
7    XX    XX    XX  
8     X      X       
9 X        XX        
0X X                 
1 XX                 
2              X     
3             XXXXX  
4                  X 
5     X         XXX  
6     XX             
7       X     X      
8     XX    X        
9     X     X  X     
0                    
Bacteria in 10th row:2
Bacteria in 10th column:0
*/
