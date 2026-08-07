package edu.cca.john.jfs.blueprint;

import java.util.Queue;
import edu.cca.john.jfs.entity.Mobile;

public interface QueueCRUD {
	Long create(Mobile mb);
	Queue<Mobile> readAll();
	Mobile readOne(Long id);
	boolean update(Mobile mb);
	boolean delete(Long id);
}
