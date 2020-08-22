package polymorphism;

public class SonySpeaker implements Speaker {

	public SonySpeaker() {
		System.out.println("===> SonySpeaker 객체 생성");
	}
	@Override
	public void volumeUp() {
		System.out.println("SonySpeaker --- 소리 키우기");

	}

	@Override
	public void volumeDown() {
		System.out.println("SonySpeaker --- 소리 줄이기");

	}

}
