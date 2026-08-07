package edu.cca.john.jfs.blueprint;

import java.util.List;
import edu.cca.john.jfs.entity.Mobile;

public interface ListCRUD {
	Long create(Mobile mb);
	List<Mobile> readAll();
	Mobile readOne(Long id);
	boolean update(Mobile mb);
	boolean delete(Long id);
}
