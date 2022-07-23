package com.swamy.dp.factorydesignpattern.demo;

public class FactoryMain {

	public static void main(String[] args) {
		FactoryShape factoryShape = new FactoryShape();
		Shape circle = factoryShape.getShape("Circle");
		circle.draw();
		
		Shape square = factoryShape.getShape("Square");
		square.draw();
		
		Shape rectangle = factoryShape.getShape("Rectangle");
		rectangle.draw();
	}
}


