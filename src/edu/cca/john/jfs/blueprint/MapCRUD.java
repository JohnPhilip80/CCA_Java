package edu.cca.john.jfs.blueprint;

import java.util.Map;

import edu.cca.john.jfs.entity.Mobile;

public interface MapCRUD {
	Long create(Mobile mb);
	Map<Long,Mobile> readAll();
	Mobile readOne(Long id);
	boolean update(Mobile mb);
	boolean delete(Long id);
}
