package edu.cca.john.jfs.blueprint;

import java.util.Set;
import edu.cca.john.jfs.entity.Mobile;

public interface SetCRUD {
	Long create(Mobile mb);
	Set<Mobile> readAll();
	Mobile readOne(Long id);
	boolean update(Mobile mb);
	boolean delete(Long id);
}
