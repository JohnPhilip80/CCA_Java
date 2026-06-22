package edu.cca.john.jfs.blueprint;

import java.util.List;

import edu.cca.john.jfs.model.Mobile;

public interface MobileCRUD {
	Long createMobile(Mobile mb);
	List<Mobile> readMobiles();
	Mobile readMobile(Long id);
	boolean updateMobile(Mobile mb);
	boolean deleteMobile(Long id);
}
