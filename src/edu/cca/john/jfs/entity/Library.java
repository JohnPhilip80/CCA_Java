package edu.cca.john.jfs.entity;

public class Library {

    // status code
    // 1  = success
    // -1 = invalid member
    // -2 = book not available
    // -3 = member limit exceeded
    public int issueBook(Book book, Member member) {

        if (member == null) {
            return -1;
        }

        if (book.getCopiesAvailable() <= 0) {
            return -2;
        }

        if (member.getBooksIssued() >= Member.MAX_BOOKS_ALLOWED) {
            return -3;
        }

        // happy path only reached if none of the above conditions triggered
        //book.copiesAvailable--;
        book.setCopiesAvailable(book.getCopiesAvailable() - 1);
        member.setBooksIssued(member.getBooksIssued() + 1);
        //member.booksIssued++;
        return 1;
    }

    
}
