import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class WordInformation {
		@FXML
	    private TextField inputWord;

	    @FXML
	    private Button itemLookup;
/*
	    @FXML
	    private Button search;

	    @FXML
	    private Label display;*/
		
	 
	public String wordSearch(String s){
		
		
		 ArrayList<String> itemList = new ArrayList<String>();
			
		  itemList.add("Soda Can");
		  itemList.add("Pizza Box");
		  itemList.add("Plastic water bottle");
		  itemList.add("Grocery bag");
		  itemList.add("Empty Windex bottle");
		  itemList.add("Makeup");
		  itemList.add("Shampoo Bottle");
		  itemList.add("Used paper towel");
		  itemList.add("Old rag");
		  itemList.add("Used up candle");
		  
		return "BLANK";
		
	}

	
	
}
