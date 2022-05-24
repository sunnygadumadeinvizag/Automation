package com.epam.pojo;

public class ISBN {

	private String isbn;

	public ISBN(String isbn) {
		this.isbn = isbn;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "ISBN [isbn=" + isbn + "]";
	}
	
	
}
