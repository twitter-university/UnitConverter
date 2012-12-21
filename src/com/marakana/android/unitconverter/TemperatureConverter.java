package com.marakana.android.unitconverter;

public enum TemperatureConverter implements UnitConverter {
	C {
		@Override
		public double toBaseUnit(double amount) {
			return amount;
		}

		@Override
		public double toUnit(double baseUnitAmount) {
			return baseUnitAmount;
		}

	},
	F {
		@Override
		public double toBaseUnit(double amount) {
			return (5.00 / 9.00) * (amount - 32.00);
		}

		@Override
		public double toUnit(double baseUnitAmount) {
			return ((9.00 / 5.00) * baseUnitAmount) + 32.00;
		}
	},
	K {
		@Override
		public double toBaseUnit(double amount) {
			return amount - 273.15;
		}

		@Override
		public double toUnit(double baseUnitAmount) {
			return baseUnitAmount + 273.15;
		}
	};

	@Override
    public abstract double toBaseUnit(double amount);

	@Override
    public abstract double toUnit(double baseUnitAmount);
}
