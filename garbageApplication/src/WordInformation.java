import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class WordInformation{
		@FXML
	    private TextField points;

	    @FXML
	    private Button lookupButton;
	    
	    @FXML 
	    private TextArea textArea;
	    
	    @FXML
	    private Button recycleBTN;
	   
	    @FXML
	    private Button trashBTN;
	    
	    //global variable i
	    int i = 0;
	    
	    //points variable
	    int numPoints = 0;
	    
	   	 
	public ArrayList<String> wordSearch(){
		
		  ArrayList<String> itemList = new ArrayList<String>();
		 
		  itemList.add("");
		  itemList.add("Soda Can");//1
		  itemList.add("Pizza Box");//2
		  itemList.add("Old rag");//3
		  itemList.add("Plastic water bottle");//4
		  itemList.add("Grocery bag");//5
		  itemList.add("Burnt out candle");//6
		  itemList.add("Empty Windex bottle");//7
		  itemList.add("Makeup");//8
		  itemList.add("Used paper towel");//9
		  itemList.add("Shampoo Bottle");//10
		  itemList.add("Empty soup can");//11
		  itemList.add("Game over! Thanks for playing!");//12
		 		
		return itemList;
	}
		

	//this method returns an element from the itemList
	public String lookupMethod(){
		
		 ArrayList<String> s = wordSearch();
		 
		 //increases i when button is clicked
		 //then sets nextListItem to the element at that index of itemList
		 
		 i++;		 
		 String nextListItem = s.get(i);	
		
		 return nextListItem;
		
	}
	
	//this method adds or subtracts a point when the recycleBTN is clicked	
	public String recycleMethod(){
		//checks to see if the user has won
		//if so, displays a message
		//if not continues adding/subtracting points from score
		if (numPoints >= 9) {
			return numPoints + " points. YOU WIN!";
			}
		else if (i == 11 && numPoints < 9) {
			return numPoints + " points. Game over. You lose";
		}
	
			//index of all elements that should be recycled
			if(i == 1 || i == 4 || i == 5 || i == 7  || i == 10 || i == 11) {	
				
				numPoints ++;	
				return "+1     Total Points: " + numPoints;
				
			}
			//index of all items that should be thrown away
			else if (i == 2 || i == 3 || i == 6 || i == 8 || i == 9){			
				numPoints --;
				return "-1     Total Points: " + numPoints;
			}
			
		return "";
	}
	
	
	//this method adds or subtracts a point when the trashBTN is clicked
	public String trashMethod(){
		if (numPoints >= 9) {
			return numPoints +  " points. YOU WIN!";
			}
		else if (i == 11 && numPoints < 9) {
			return numPoints + " points. Game over. You lose";
		}
		
			//index of all elements that should be thrown away	
			if(i == 2 || i == 3 || i == 6 || i == 8 | i == 9) {	
				
				numPoints ++;	
				return "+1     Total Points: " + numPoints;
				
			}
			
			else if (i == 1 || i == 4 || i == 5 || i == 7 || i == 10 || i == 11) {
				
				numPoints --;
				return "-1     Total Points: " + numPoints;
				
				}	
		return "";	
		
	}
	
	//this method starts the game over
	public void restartMethod() {
		i = 0;
		numPoints = 0;
		lookupMethod();
	}
	  
}
