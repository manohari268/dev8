package com.exmple;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
	System.out.println( "This is a simple real world example" );
	int a=5;
	int b=10;
	System.out.println( "The sum of"+a+"and"+b+"is"+sum(a,b) );

    }
	public static int sum(int x, int y){
		return x+y;
	}
}
