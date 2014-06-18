package springjdbc.dao.jdbc;

import springjdbc.InvalidMemberPasswordException;
import springjdbc.Member;
import springjdbc.MemberException;
import springjdbc.UnknownMemberException;
import springjdbc.dao.MemberDAO;

import java.util.ArrayList;
import java.util.List;


public class MemberDAOImpl implements MemberDAO {
    private static final List<Member> members;

    static {
        members = new ArrayList<Member>();
        members.add(new Member("93941", "j.smith", "hiking", "w 49th St.", "New York", "10019", "U.S.A.", "1010-695-3405", "AAE", "jsmith@xs4all.com", 'A', null));
        members.add(new Member("93947", "j.wirth", "whoknows", "121 Grandview Rd", "Braintree", "2184", "U.S.A.", "1003-345-8754", "ATN", "jwirth@tiscali.com", 'A', null));
    }

    public String getMemberID(String userName, String password) throws MemberException {
        for (Member member : members) {
            if (userName.equals(member.getUserName())) {
                if (password.equals(member.getPassword())) {
                    return member.getMemberID();
                } else {
                    throw new InvalidMemberPasswordException("Invalid password provided");
                }
            }
        }
        throw new UnknownMemberException(userName + " is not registered in system");
    }
}
