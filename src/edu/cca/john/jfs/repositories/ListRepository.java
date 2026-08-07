package edu.cca.john.jfs.repositories;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Comparator;
import java.util.List;

import edu.cca.john.jfs.blueprint.ListCRUD;
import edu.cca.john.jfs.entity.Mobile;
//import edu.cca.john.jfs.util.BrandComparator;
//import edu.cca.john.jfs.util.PriceComparator;

public class ListRepository implements ListCRUD {
	
	private List<Mobile> mobiles;
	
	public ListRepository() {
		mobiles = new ArrayList<Mobile>();
		mobiles.add(new Mobile("Apple","IPhone 16 Pro Max",2026,125700.00));
		mobiles.add(new Mobile("Samsung","S25",2023,92800.00));
		mobiles.add(new Mobile("Motorola","Edge 5",2023,15900.00));
		mobiles.add(new Mobile("Redmi","Note 6",2022,18250.00));
		mobiles.add(new Mobile("Lava","Agni 3",2021,32800.00));
	}

	@Override
	public Long create(Mobile mb) {
		mobiles.add(mb);
		return mb.getId();
	}

	@Override
	public List<Mobile> readAll() {
		return mobiles;
	}

	@Override
	public Mobile readOne(Long id) {
		Mobile mobile = null;
		for(Mobile mob:mobiles) {
			if(mob.getId().equals(id)) {
				mobile = mob;
				break;
			}
		}
		return mobile;
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
		Mobile mob = readOne(id);
		if(mob != null) {
			mobiles.remove(mob);
			return true;
		}
		else {
			return false;
		}
	}
	
	public void sort() {
		
		//Collections.sort(mobiles, new BrandComparator());
		
		//Collections.sort(mobiles,new PriceComparator());
		
		/*Collections.sort(mobiles, new Comparator<Mobile>() {

			@Override
			public int compare(Mobile o1, Mobile o2) {
				return o2.getBrand().compareTo(o1.getBrand());
			}
			
		});*/
		
		/*Collections.sort(mobiles, new Comparator<Mobile>() {

			@Override
			public int compare(Mobile o1, Mobile o2) {
				return (int) (o2.getPrice()- o1.getPrice());
			}
			
		});*/
		
		//Collections.sort(mobiles, (o1,o2) -> (int) (o2.getPrice()- o1.getPrice()));
		Collections.sort(mobiles, (o1,o2) -> (o2.getBrand().compareTo(o1.getBrand())));
		
		
		/*Collections.sort(mobiles,new Comparator<Mobile>() {

			@Override
			public int compare(Mobile o1, Mobile o2) {
				return o1.getBrand().compareTo(o2.getBrand());
			}
		});*/
		
		//Collections.sort(mobiles, (o1,o2) -> o1.getBrand().compareTo(o2.getBrand()));
		
	}
}


