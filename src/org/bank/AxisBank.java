package org.bank;

	public class AxisBank extends BankInfo {
		@Override
		public void deposit() {
			System.out.println("deposit= 15%");
		}
		public static void main(String[] args) {
			AxisBank a = new AxisBank();
			a.deposit();
			a.saving();
			a.fixed();
		}

	}



