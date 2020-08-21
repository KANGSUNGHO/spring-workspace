package polymorphism;

public class SamsungTV implements TV {

	@Override
	public void powerOn() {
		System.out.println("SamsungTV -- 전원 키기");

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
