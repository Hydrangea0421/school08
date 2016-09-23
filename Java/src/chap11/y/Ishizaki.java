package chap11.y;

import chap11.x.Maruyama;

public class Ishizaki {

	void func(Maruyama m){
		m.maru1();	//ok	(publicしか呼べません)
//		m.maru2();	//error	(protectedなので不可)
//		m.maru3();	//error	(defaultなので不可)
//		m.maru4();	//error	(privateなので不可)
	}
}
