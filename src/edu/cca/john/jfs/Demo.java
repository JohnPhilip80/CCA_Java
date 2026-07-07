//CRUD Operations with ArrayList
package edu.cca.john.jfs;

import edu.cca.john.jfs.entity.Book;
import edu.cca.john.jfs.entity.Library;
import edu.cca.john.jfs.entity.Member;

public class Demo {
	public static void main(String[] args) {
        Library library = new Library();
        Book book = new Book("Effective Java", 0); // no copies left
        Member member = new Member("Arjun");

        int result = library.issueBook(book, member);

        // caller must remember to check the code and know what each number means
        if (result == 1) {
            System.out.println("Book issued: " + book.getTitle() + " to " + member.getName());
        } else if (result == -1) {
            System.out.println("Issue failed: Member record not found in system.");
        } else if (result == -2) {
            System.out.println("Issue failed: '" + book.getTitle() + "' is currently out of stock.");
        } else if (result == -3) {
            System.out.println("Issue failed: " + member.getName() + " has already issued the maximum allowed books.");
        } else {
            System.out.println("Issue failed: Unknown error.");
        }

        // cleanup/logging has to be manually placed after every possible branch
        // (or duplicated in each branch) since there's no "finally" guarantee
        System.out.println("Transaction log updated for member: " +
            (member != null ? member.getName() : "UNKNOWN"));
    }
}

/*
The method signature lies. 
	public int issueBook(...) looks like it just returns an int — nothing in the signature tells the caller "hey, this can fail in 3 different ways." 
	Compare that to throws BookNotAvailableException, MemberLimitExceededException, which documents the failure modes right in the method declaration.
Magic numbers instead of meaningful types. 
	-1, -2, -3 mean nothing on their own. 
	Someone reading if (result == -2) six months later has to go find the issueBook() method just to know what that means. 
	With exceptions, catch (BookNotAvailableException e) is self-documenting.
Nothing forces the caller to check. 
	If a programmer calls library.issueBook(book, member); and just ignores the returned int completely, 
	the code compiles fine and silently proceeds as if the book was issued — 
	even though it wasn't. With checked exceptions, the compiler refuses to compile unless the caller handles or declares the exception.
No structured cleanup. 
	Notice the log line at the end runs regardless of outcome, but it's just sitting after the if-else chain by convention — 
	nothing enforces it runs even if, say, an unexpected NullPointerException happened elsewhere in the method. 
	finally in the exception-based version guarantees that.
Doesn't scale. 
	Right now there are 3 error types. Real systems often have 10+. 
	Imagine this if-else chain (or the equivalent switch) with 15 branches, 
	and every single caller of issueBook() needing to repeat that same chain to interpret the code correctly.
*/


















