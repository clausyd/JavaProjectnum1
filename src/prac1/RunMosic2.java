package prac1;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class RunMosic2 extends Application {
	
	@Override 
	public void start(Stage ps) 
	{ // TODO Auto-generated method stub 
		try{ HBox hb = FXMLLoader.load(getClass().getResource("Mosic2.fxml")); 
		Scene s=new Scene(hb,300,300);   
		ps.setScene(s); ps.setTitle("Color Mosic"); ps.show();
		}catch(IOException e){}   
	}
		  


	public static void main(String[] args) 
	{ // TODO Auto-generated method stub 
		launch(args); }
	}
		
