package demo.servant;

import Ice.Current;
import demo._PrinterDisp;

public class PrinterI extends _PrinterDisp{

	private static final long serialVersionUID = 1L;

	@Override
	public void printString(String s, Current __current) {
		System.out.println("PrinterI打印：" + s);
		System.out.println("返回的值为：" + SipPushUtil.push(null, "123", "test"));
	}

}
