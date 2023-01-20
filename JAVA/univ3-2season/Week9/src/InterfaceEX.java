interface PhoneInterface{
	final int TIMEOU=10000;
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("**phone**");
	}
	
}
class SamsungPhone implements PhoneInterface{
	@Override
	public void sendCall() {
		System.out.println("띠리리리리링");
	}
	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
}
public void flash() {
	System.out.println("전화기에 불이 켜졌습니다.");
    }
}
	
public class InterfaceEX {

	public static void main(String[] args) {
		SamsungPhone phone=new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
	}

}
