package com.nt.service;

/**
 * Hello world!
 */
public class App {
	public int sum(int x, int y) {
		return x+y;
	}
	public int sub(int x, int y) {
		return x-y;
	}
	public int mul(int x,int y) {
       System.out.println("mul() method");
		return x*y;
	}
	public int div(int x, int y) {
		return x/y;
	}
	

	public String reverse(String name) {
		StringBuilder sb=new StringBuilder(name);
		return sb.reverse().toString();
	}
	public int findNameLength(String name) {
		System.out.println("App.findNameLength() bug 123 fixing is going on");
		return name.length();
	}
    public static void main(String[] args) {
        App app=new App();
        System.out.println("sum is :: "+app.sum(10, 20));
    }
}
