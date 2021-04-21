package p08.textbook.s080301;

import p08.textbook.s080205.RemoteControl;

public class Television implements RemoteControl{
	// 필드
	
	private int volume;
	// turnOn() 추상 메소드의 실체 메소드
	public void turnOn() {
		System.out.println("Tv를 겹니다.");
	}
	// turnOff() 추상 메소드의 실체 메소드
	public void turnOff() {
		System.out.println("Tv를 끕니다.");
	}
	// setVolume() 추상 메소드의 실체 메소드
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨: " + this.volume);
	}
	
	

}
