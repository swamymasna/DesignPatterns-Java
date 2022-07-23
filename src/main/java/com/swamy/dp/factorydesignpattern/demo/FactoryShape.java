package com.swamy.dp.factorydesignpattern.demo;

public class FactoryShape {

	public Shape getShape(String shape) {
		
		if(shape.equalsIgnoreCase("Circle")) {
			return new Circle();
		}
		else if(shape.equalsIgnoreCase("Square")) {
			return new Square();
		}
		else if(shape.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		}
		
		return null;
	}
}
