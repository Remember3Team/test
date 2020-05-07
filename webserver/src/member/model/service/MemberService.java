package member.model.service;

import static common.JDBCTemplate.*;

import java.sql.Connection;

import member.model.dao.MemberDao;
import member.model.vo.Member;
public class MemberService {

	public Member loginMember(Member member) {
		Connection conn = getConnection();
		
		Member loginMember = new MemberDao().loginMember(conn,member);
		
		close(conn);
		
		return loginMember;
	}

	public int insertMember(Member member) {
		Connection conn = getConnection();
		
		int result = new MemberDao().insertMember(conn,member);
		if(result>0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}

	public Member selectMember(String userId) {
		Connection conn = getConnection();
		
		Member selectMember = new MemberDao().selectMember(conn,userId);
		if(selectMember!=null) {
			System.out.println("Member Service 에서 조회한 값은?"+selectMember);
		}
		else {
			System.out.println("조회실패");
		}
		return selectMember;
	}

	public int updateMember(Member member) {
		Connection conn = getConnection();
		int result = new MemberDao().updateMember(conn,member);
		if(result>0) {
			commit(conn);
		}else {
			rollback(conn);
			
		}
		close(conn);
		System.out.println("SERVICE = result>"+result);

		return result;
	}

	public int deleteMember(String userId) {
		Connection conn = getConnection();
		int result = new MemberDao().deleteMember(conn,userId);
		if(result>0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		return result;
	}

}
