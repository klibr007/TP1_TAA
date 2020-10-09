package dao;

import fr.istic.m2.TP1_TAA.Section;

public class SectionDao extends AbstractJpaDao<Long, Section>{
	
	public SectionDao() {
		this.setClazz(Section.class);
	}
	
}
