package polymorphism;

public class AppleSpeaker implements Speaker {

	public AppleSpeaker() {
		System.out.println("===> AppleSpeaker 객체 생성");
	}
	@Override
	public void volumeUp() {
		System.out.println("AppleSpeaker 소리 키우기");

	}

	@Override
	public void volumeDown() {
		System.out.println("AppleSpeaker 소리 줄이기");

	}

}
