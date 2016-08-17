import acm.program.*;

public class WheelCombo {

	public WheelCombo(int wheel1, int wheel2, int wheel3, int money) {
		this.wheel1 = wheel1;
		this.wheel2 = wheel2;
		this.wheel3 = wheel3;
		this.money = money;
	}
	
	public boolean isMatch(int wheel1, int wheel2, int wheel3) {
		return (wheel1 == this.wheel1 && wheel2 == this.wheel2 && wheel3 == this.wheel3);
	}
	
	public int getPayout() {
		return this.money;
	}
	
	private int wheel1;
	private int wheel2;
	private int wheel3;
	private int money;
}
