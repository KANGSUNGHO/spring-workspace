package polymorphism;

public class LgTV implements TV {

	@Override
	public void powerOn() {
		System.out.println("LgTV -- 전원 키기");

	}

	@Override
	public void powerOff() {
		System.out.println("LgTV -- 전원 끄기");

	}

	@Override
	public void volumeUp() {
		System.out.println("LgTV -- 볼륨 키우기");

	}

	@Override
	public void volumeDown() {
		System.out.println("LgTV -- 볼륨 내리기");

	}

}
