package util;

public interface View {
	int HOME = 1;
	int MAIN = 11;
	// ��� ��� ����
	int MEMBER = 2;
	int MEMBER_SIGNUP = 21;
	int MEMBER_LOGIN = 22;
	int MEMBER_RESIGN = 23;
	int MEMBER_UPDATE = 24; 
	
	// ���� ��� ����
	   // *****���� ���
	   int RESERVATION = 3; //�Խ�, ��� ����
	   int RESERVATION_RNO = 311;
	   int RESERVATION_SNO = 312;
	   int RESERVATION_IN = 31;
	   int RESERVATION_OUT = 32;
	//   int RESERVATION_ADD = 33;//����
	
	// ���¿� - �����Խ���
	int FREE = 4;
	int FREE_LIST = 41;
	int FREE_DETAIL = 42;
	int FREE_INSERT = 43;
	int FREE_UPDATE = 44;
	int FREE_DELETE = 45;

	// �׽�Ʈ �Խ���
	int TEST = 5;
	int TEST_LIST = 51;
}
