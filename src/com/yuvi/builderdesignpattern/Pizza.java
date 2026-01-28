package com.yuvi.builderdesignpattern;

 class Pizza {
	 
	 private final String rate;
	 private final String topping;
	 private final String  spiceLevel;
	 
	 private Pizza(PizzaBuilder builder) {
		 this.rate = builder.rate;
		 this.topping = builder.topping;
		 this.spiceLevel = builder.spiceLevel;
	 }
	 
	 public String getRate() {
		 return rate;
	 }
	 
	 public String getTopping() {
		 return topping;
	 }
	 
	 public String getSpiceLevel() {
		 return spiceLevel;
	 }
	 
	 @Override
	public String toString() {
		return "Pizza's Order ::>> [Rate = " + rate + " | Topping = " + topping + " | SpiceLevel = " + spiceLevel + "]";
	}

	 // Inner class to create object
	 static class PizzaBuilder {
		   
		 private String rate;
		 private String topping;
		 private String spiceLevel;
		 
		 public static PizzaBuilder newPizza() {
			 return new PizzaBuilder();
		 }
		 
		 public PizzaBuilder setRate(String rate) {
			 this.rate = rate;
			 return this;
		 }
		 
		 public PizzaBuilder setTopping(String topping) {
			 this.topping = topping;
			 return this;
		 }
		 
		 public PizzaBuilder setSpiceLevel(String spiceLevel) {
			 this.spiceLevel = spiceLevel;
			 return this;
		 }
		 
		 public Pizza making() {
			 Pizza pizza = new Pizza(this);
			 return pizza;
		 }
		 
	 }

}
