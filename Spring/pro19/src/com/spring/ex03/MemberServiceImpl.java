package com.spring.ex03;

public class MemberServiceImpl implements MemberService {
	private MemberDAO memberDAO;//���ԵǴ� ���� ������ �Ӽ� ����

	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;//�Ӽ� ����
	}

	@Override
	public void listMembers() {
		memberDAO.listMembers();
	}
}
