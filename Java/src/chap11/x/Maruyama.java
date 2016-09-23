package chap11.x;

public class Maruyama {
	public void maru1(){}		 // 誰でもOK
	protected void maru2(){}   // 同一package内でのみOK(例外あり、次章で説明)
	void maru3(){}				 // 同一package内でのみOK
	private void maru4(){}		 // 誰もアクセスできない


	public void func(Maruyama m){
		m.maru1();	// ok
		m.maru2();	// ok
		m.maru3();	// ok
		m.maru4();	// ok
	}
}