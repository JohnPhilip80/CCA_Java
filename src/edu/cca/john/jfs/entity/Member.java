package edu.cca.john.jfs.entity;

public class Member {
    private String name;
    private int booksIssued;
    
    static final int MAX_BOOKS_ALLOWED = 3;

    public Member(String name) {
        this.name = name;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBooksIssued() {
		return booksIssued;
	}

	public void setBooksIssued(int booksIssued) {
		this.booksIssued = booksIssued;
	}
    
}

