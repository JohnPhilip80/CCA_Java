package edu.cca.john.jfs.repositories;

import java.util.HashMap;
import java.util.Map;

import edu.cca.john.jfs.blueprint.MapCRUD;
import edu.cca.john.jfs.entity.Mobile;

public class MapRepository implements MapCRUD {
	private Map<Long,Mobile> mobiles;
	
	public MapRepository() {
		mobiles = new HashMap<Long,Mobile>();
		
		Mobile mob;
		
		mob = new Mobile("Apple","IPhone 16 Pro Max",2026,125700.00);
		mobiles.put(mob.getId(),mob);
		
		mob = new Mobile("Samsung","S25",2023,92800.00);
		mobiles.put(mob.getId(), mob);

		mobiles.put(2003L, new Mobile("Motorola","Edge 5",2023,15900.00));
		mobiles.put(2004L, new Mobile("Redmi","Note 6",2022,18250.00));
		mobiles.put(2005L, new Mobile("Lava","Agni 3",2021,32800.00));
	}
	@Override
	public Long create(Mobile mb) {
		mobiles.put(mb.getId(),mb);
		return mb.getId();
	}

	@Override
	public Map<Long, Mobile> readAll() {
		return mobiles;
	}

	@Override
	public Mobile readOne(Long id) {
		return mobiles.get(id);
	}

	@Override
	public boolean update(Mobile mb) {
		Mobile mob = readOne(mb.getId());
		if(mob != null) {
			mob.setBrand(mb.getBrand());
			mob.setModel(mb.getModel());
			mob.setPrice(mb.getPrice());
			mob.setYearLaunched(mb.getYearLaunched());
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean delete(Long id) {
		if(mobiles.remove(id) != null) {
			return true;
		}
		else {
			return false;
		}
	}

}
