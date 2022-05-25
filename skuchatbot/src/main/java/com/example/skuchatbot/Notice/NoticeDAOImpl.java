package com.example.skuchatbot.Notice;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class NoticeDAOImpl implements NoticeDAO{
    final SqlSession sqlSession; // SqlSession 의존관계 주입

    public NoticeDAOImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public String AddrCheck(NoticeDTO dto) {
        return sqlSession.selectOne("Notice.AddrCheck", dto);
    }

}
