import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;





public class nameView {

	private TextField name;
	private Stage stage;
	private Label lbl1;
	private Button okButton;
	private Button exitButton;
	
	
	public nameView(Stage stage) {
		this.stage = stage;


		lbl1 = new Label("Name: ");
		okButton = new Button ("Ok");
		exitButton = new Button("Exit");
		
			
	
	
	
	}
	
	
	
}
