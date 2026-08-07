package edu.cca.john.jfs.blueprint;
import java.util.Stack;

import edu.cca.john.jfs.entity.Mobile;

public interface StackCRUD {
	Long create(Mobile mb);
	Stack<Mobile> readAll();
	Mobile readOne(Long id);
	boolean update(Mobile mb);
	boolean delete(Long id);
}
