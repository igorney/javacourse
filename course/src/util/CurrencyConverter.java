package util;

public class CurrencyConverter {
	public static double IOF = 0.06;
	public static double dollarToReal(double dollarPrice, double aumount) {
		return aumount * dollarPrice * (1.0 + IOF);
	}
}
