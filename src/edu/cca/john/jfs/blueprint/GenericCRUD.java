package edu.cca.john.jfs.blueprint;

import edu.cca.john.jfs.entity.Mobile;

public interface GenericCRUD<T1,T2,T3> {
	Long create(T2 item);
	T1 readAll();
	Mobile readOne(T3 id);
	boolean update(T2 item);
	boolean delete(T3 id);
}
