package edu.cca.john.jfs.entity;

import edu.cca.john.jfs.exceptions.BookNotAvailableException;
import edu.cca.john.jfs.exceptions.InvalidMemberException;
import edu.cca.john.jfs.exceptions.MemberLimitExceededException;

public class Library {

    // status code
    // 1  = success
    // -1 = invalid member
    // -2 = book not available
    // -3 = member limit exceeded
    public int issueBook(Book book, Member member) throws BookNotAvailableException, MemberLimitExceededException, InvalidMemberException {

    	if (member == null) {
            throw new InvalidMemberException("Member record not found in system.");
        }

    	if (book.getCopiesAvailable() <= 0) {
            throw new BookNotAvailableException("'" + book.getTitle() + "' is currently out of stock.");
        }
        if (member.getBooksIssued() >= Member.MAX_BOOKS_ALLOWED) {
            throw new MemberLimitExceededException(member.getName() + " has already issued the maximum allowed books.");
        }

        book.setCopiesAvailable(book.getCopiesAvailable() - 1);
        member.setBooksIssued(member.getBooksIssued() + 1);
        System.out.println("Book issued: " + book.getTitle() + " to " + member.getName());
        
        return 1;
    }

    
}
