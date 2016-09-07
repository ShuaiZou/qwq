package com.jihefanxing.java;

public class StudentImpl<T> implements Animal<T> {
		private String sex;

		public String getSex() {
			return sex;
		}

		public void setSex(String sex) {
			this.sex = sex;
		}
		@Override
		public void eat(T food) {
		// TODO Auto-generated method stub
			System.out.println("Ив");
		}
}
