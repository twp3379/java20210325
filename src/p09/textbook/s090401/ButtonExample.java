package p09.textbook.s090401;

public class ButtonExample {
	public static void main(String[] args) {
		Button btn = new Button();

		btn.setOnClickListener(new callListener());
		btn.touch();

		btn.setOnClickListener(new MessageListener());
		btn.touch();
	}

}
