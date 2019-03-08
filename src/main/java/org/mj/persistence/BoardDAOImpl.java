package org.mj.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.mj.domain.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO{

	@Inject
	private SqlSession session;
	
	private static String namespace = "org.mj.mapper.BoardMapper";
	
	@Override
	public void create(BoardVO vo) throws Exception{
		session.insert(namespace+".create", vo);
	}
	
	@Override
	public BoardVO read(Integer bno) throws Exception{
		return session.selectOne(namespace+".read", bno);
	}
	
	@Override
	public void update(BoardVO vo) throws Exception{
		session.update(namespace+".update", vo);
	}
	
	public void delete(Integer bno) throws Exception{
		session.delete(namespace+".delete", bno);
	}
	
	public List<BoardVO> listAll() throws Exception{
		return session.selectList(namespace+".listAll");
	}
	
}
