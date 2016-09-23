package chap11.b;

import chap11.a.Chida;

class Yasuda {
	static int count = 0; // クラス変数

	/* private */ String name; // インスタンス変数/メソッド

	static void javasen8() { // staticメソッド
	}

	void print() { // インスタンスメソッド
	}

	Chida chida; // ok
	// Ueda ueda; //error
}
