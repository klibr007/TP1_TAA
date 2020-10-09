package dao;

import fr.istic.m2.TP1_TAA.Tag;

public class TagDao extends AbstractJpaDao<Long, Tag>{
	
	public TagDao() {
		this.setClazz(Tag.class);
	}
	
}
