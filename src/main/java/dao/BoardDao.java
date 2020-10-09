package dao;



import fr.istic.m2.TP1_TAA.Board;



public class BoardDao extends AbstractJpaDao<Long, Board>{
	
	public BoardDao() {
		this.setClazz(Board.class);
	}
	
}
