package chap11.x;

class Sin {

	void func(Maruyama m){

		m.maru1();	//ok
		m.maru2();	//ok
		m.maru3();	//ok
//		m.maru4();	//error	(privateなので不可)
	}

}
