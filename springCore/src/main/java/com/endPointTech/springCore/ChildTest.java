package com.endPointTech.springCore;

public class ChildTest extends Test {

	@Override
	public int getNum() {
		return 0;
	}
	@Override
	int add(int a, int b, int c) {
		return a+b;
	}

}
