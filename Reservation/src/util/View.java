package util;

public interface View {
	int HOME = 1;
	int MAIN = 11;
	// 멤버 담당 팀원
	int MEMBER = 2;
	int MEMBER_SIGNUP = 21;
	int MEMBER_LOGIN = 22;
	int MEMBER_RESIGN = 23;
	int MEMBER_UPDATE = 24; 
	
	// 보드 담당 팀원
	   // *****예약 담당
	   int RESERVATION = 3; //입실, 퇴실 선택
	   int RESERVATION_RNO = 311;
	   int RESERVATION_SNO = 312;
	   int RESERVATION_IN = 31;
	   int RESERVATION_OUT = 32;
	//   int RESERVATION_ADD = 33;//연장
	
	// 이태영 - 자유게시판
	int FREE = 4;
	int FREE_LIST = 41;
	int FREE_DETAIL = 42;
	int FREE_INSERT = 43;
	int FREE_UPDATE = 44;
	int FREE_DELETE = 45;

	// 테스트 게시판
	int TEST = 5;
	int TEST_LIST = 51;
}
