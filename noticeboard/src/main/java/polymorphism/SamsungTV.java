package polymorphism;

import org.springframework.stereotype.Component;

@Component
public class SamsungTV implements TV {
	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("==> SamsungTV(1) 객체 생성");
	}
	
	public SamsungTV(Speaker speaker) {
		System.out.println("==> SamsungTV(2) 객체 생성");
		this.speaker = speaker;
	}
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("==> SamsungTV(3) 객체 생성");
		this.speaker = speaker;
		this.price = price;
	}

	@Override
	public void powerOn() {
		System.out.println("SamsungTV -- 전원 키기, 가격: " + price );

	}

	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker() 호출");
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		System.out.println("===> setPrice() 호출");
		this.price = price;
	}

	@Override
	public void powerOff() {
		System.out.println("SamsungTV -- 전원 끄기");

	}

	@Override
	public void volumeUp() {
		System.out.println("SamsungTV -- 볼륨 키우기");

	}

	@Override
	public void volumeDown() {
		System.out.println("SamsungTV -- 볼륨 줄이기");

	}

}
