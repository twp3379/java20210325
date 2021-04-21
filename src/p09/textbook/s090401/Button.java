package p09.textbook.s090401;

public class Button {
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	interface OnClickListener {
		void onClick();
	}
<<<<<<< HEAD
}





=======

}
>>>>>>> branch 'master' of https://github.com/twp3379/java20210325.git
