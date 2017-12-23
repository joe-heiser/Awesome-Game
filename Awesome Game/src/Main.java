
public class Main {
	

	/**
     * Private constructor so this utility class cannot be instantiated.
     */

	 private Main() {
	    }
    
    public static void main(String[] args) {
    	Unit p1 = new Unit("Sanata");
//Data Creation
    char[][] TestSet = new char[10][10];
    	for(int x = 0; x<10;x++) {
    		for(int y = 0; y<10;y++) {
    			TestSet[x][y] = '#';
    		}
    	}
//Data Creation
    	
//Set Start Position
    	p1.setXpos(0);
    	p1.setYpos(0);
    	  	
//Set Start Position
    	
    	
while(true) {   	
//Player Position    	
TestSet[p1.getXpos()][p1.getYpos()] = '*'; 	
//Player Position

//key inputs

//key inputs

//Console Print
    	for(int x = 0; x<10;x++) {
    		for(int y = 0; y<10;y++) {
    			System.out.printf("%c\t",TestSet[x][y]);
    		}
    		System.out.printf("\n");
    	}
    
//Console Print
//Freedom
    	break;
//Freedom
    	}
    }

}
