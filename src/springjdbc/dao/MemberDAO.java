package springjdbc.dao;

import springjdbc.MemberException;


public interface MemberDAO {
    public String getMemberID(String userName, String password) throws MemberException;
}
