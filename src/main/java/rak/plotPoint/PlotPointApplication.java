package rak.plotPoint;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class PlotPointApplication extends Application {
	public final static String MAIN_MENU = "MainMenu";
	private static Stage primaryStage;
	
	
	@Override
	public void start(Stage primaryStage) {
		PlotPointApplication.primaryStage = primaryStage;
		try {
			primaryStage.setTitle("Plot Point");
			setScene(MAIN_MENU);
			primaryStage.getIcons().add(new Image(PlotPointApplication.class.getResourceAsStream("images/Logo Icon.png")));
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public static void setScene(String sceneName){
		try {
			Scene scene = loadFXML(sceneName);
			primaryStage.setScene(scene);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static Scene loadFXML(String fileName) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader();
		fxmlLoader.setLocation(PlotPointApplication.class.getResource("view/" + fileName + ".fxml"));
		Parent root = fxmlLoader.load();
		
		Scene scene = new Scene(root);
		return scene;
	}
}
