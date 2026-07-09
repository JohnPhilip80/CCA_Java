//CRUD Operations with ArrayList
package edu.cca.john.jfs;

import edu.cca.john.jfs.entity.Book;
import edu.cca.john.jfs.entity.Library;
import edu.cca.john.jfs.entity.Member;
import edu.cca.john.jfs.exceptions.BookNotAvailableException;
import edu.cca.john.jfs.exceptions.InvalidMemberException;
import edu.cca.john.jfs.exceptions.MemberLimitExceededException;

public class Demo {
	public static void main(String[] args) {
        Library library = new Library();
        Book book = new Book("Effective Java", 0); // no copies left
        Member member = new Member("John");

        int result;
		try {
			result = library.issueBook(book, member);
		} 
		catch (BookNotAvailableException e) {
			System.out.println("Issue failed: " + e.getMessage());
		}
		catch (MemberLimitExceededException e) {
			System.out.println("Issue failed: " + e.getMessage());
		}
		catch (InvalidMemberException e) {
			System.out.println("Issue failed: " + e.getMessage());
		}
		finally{
			System.out.println("Transaction log updated for member: " + member.getName());
		}
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


/*
 * Notice issueBook() doesn't know or care how the caller will react to a failure — it just declares what can go wrong and throws. The caller decides what to do (waitlist, notify, retry, log). That separation is the whole point.
Why not just use if-else?
You can technically replace exceptions with if-else and return codes — old C-style code did exactly that. It breaks down for a few concrete reasons:
1. Error handling gets tangled with business logic.
With if-else, every method has to check "did the last step fail?" before doing the next thing. With exceptions, issueBook() just writes the happy path; failure jumps straight to the catch block, keeping the logic readable.
2. Errors can't easily cross multiple call layers.
Suppose issueBook() is called by processTransaction(), which is called by handleRequest(). If issueBook() fails deep inside, an if-else approach forces every method in that chain to check a return code and manually re-check-and-return it upward — polluting every method's return type and signature. An exception just propagates up automatically until something catches it, no matter how many layers deep.
3. You can't return "success data" and "error info" at the same time cleanly.
A method like issueBook() doesn't return anything meaningful (or in other cases returns an object). If you used error codes instead of exceptions, you'd need something like returning -1, null, or a special sentinel value — which is ambiguous (is null a real "no result" or a failure?) and easy to forget to check.
4. Multiple distinct failure types are handled distinctly.
Here we have three different problems: book unavailable, member limit exceeded, invalid member. With exceptions, each gets its own catch block with tailored recovery logic. With if-else, you'd be juggling multiple boolean flags or error codes and nested conditionals to figure out which thing failed.
5. Checked exceptions force you to handle the problem.
throws BookNotAvailableException, MemberLimitExceededException in the method signature means the compiler won't let you call issueBook() without acknowledging these possible failures. An if-else based approach relies entirely on the programmer remembering to check — nothing stops you from ignoring an error code.
6. finally guarantees cleanup regardless of what failed.
Closing a database connection, releasing a file lock, or logging a transaction (like above) needs to happen whether the method succeeds or throws any of several exception types. Replicating that with if-else means duplicating the cleanup code in every branch, or risking it being skipped.
7. Stack traces for debugging.
An exception carries the full call stack showing exactly where and how it happened. An if-else/error-code approach just gives you a value like -2, and someone has to go dig through the code to figure out what that means.
The underlying idea worth emphasizing to students: if-else is for expected, normal branching logic (rainy day vs sunny day). Exceptions are for exceptional, unexpected conditions that disrupt the normal flow and need to be handled possibly far away from where they occurred.

*/


















