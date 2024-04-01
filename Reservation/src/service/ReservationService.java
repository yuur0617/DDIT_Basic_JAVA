package service;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import util.ScanUtil;
import util.PrintUtil;
import util.JDBCUtil;
import util.View;

public class ReservationService {
	private static ReservationService instance = null;

	JDBCUtil jdbc = JDBCUtil.getInstance();

	private ReservationService() {
	}

	public static ReservationService getInstance() {
		if (instance == null)
			instance = new ReservationService();
		return instance;
	}

	public static void main(String[] args) {
		ReservationService rse = new ReservationService();
		rse.reservation();
	}

	// sql, List�÷���, rs, rno, sno ��������
	String sql = null;
	List<Map<String, Object>> paramR = null;
	int rs = 0;
	int rno = 0;
	int sno = 0;
	String select;

//�ڷΰ��� ���� ����...
	public int reservation() {
		// ȭ�� ����
		PrintUtil.bar2();
		PrintUtil.blank(1);
		System.out.println("\t\t�¼� ����");
		System.out.println("");
		System.out.println("\t\t1. �Խ�");
		System.out.println("\t\t2. ���");
		System.out.println("\t\t3. ����ð� ����");
		PrintUtil.blank(1);
		PrintUtil.bar();
		System.out.println("\t\t\t\t0. �ڷΰ���");
		System.out.print("\t\t���� >> ");

		// ��ɹ� ����
		switch (ScanUtil.nextInt()) {

		case 0:
			return View.HOME;// ��Ʈ�ѷ� �����ؾ� ���ư�

		case 1:
			reservationRno();// ��Ʈ�ѷ� �����Ҷ� �ּ�ó��
			return View.RESERVATION_RNO;

		case 2:
			System.out.println("\t\tȣ���Է� >> ");// ��� �������� ���ప �ҷ����� ����..
			int a = ScanUtil.nextInt();
			System.out.println("\t\t�¼��Է� >> ");
			int b = ScanUtil.nextInt();
			reservationOut(a, b);
			return View.RESERVATION_OUT;

//		case 3: �ð����� ����...??

		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			reservation();
			return View.RESERVATION;
		}
	}

	public int reservationRno() {
		PrintUtil.bar2();
		System.out.println("");
		System.out.println("\t\t������ ����");
		System.out.println("\t   1. 101ȣ" + "( " + count(101) + " / 9  )");
		System.out.println("\t   2. 102ȣ" + "( " + count(102) + " / 9  )");
		System.out.println("\t   3. 103ȣ" + "( " + count(103) + " / 9  )");
		System.out.println("\t   4. 201ȣ" + "( " + count(201) + " / 20 )");
		System.out.println("\t   5. 202ȣ" + "( " + count(202) + " / 20 )");
		System.out.println("");
		PrintUtil.bar2();
		System.out.println("");
		System.out.println("\t\t\t\t0. �ڷΰ���");
		System.out.print("\t\t���� >> ");

		switch (ScanUtil.nextInt()) {

		case 0:
			reservation();
			return View.RESERVATION;

		case 1:
			rno = 101;
			sno = reserveSeat9(rno);
			reservationIn(rno, sno); 
			return View.RESERVATION_IN;

		case 2:
			rno = 102;
			sno = reserveSeat9(rno);
			reservationIn(rno, sno);
			return View.RESERVATION_IN;

		case 3:
			rno = 103;
			sno = reserveSeat9(rno);
			reservationIn(rno, sno);
			return View.RESERVATION_IN;

		case 4:
			rno = 201;
			sno = reserveSeat20(rno);
			reservationIn(rno, sno);
			return View.RESERVATION_IN;

		case 5:
			rno = 202;
			sno = reserveSeat20(rno);
			reservationIn(rno, sno);
			return View.RESERVATION_IN;

		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			reservationRno();
			return View.RESERVATION_RNO;
		}
	}

	public int reserveSeat9(int rno) {
		sql = " SELECT * FROM SEAT WHERE SEAT_RNO = " + rno;
		paramR = jdbc.selectList(sql);
		PrintUtil.bar2();
		System.out.println("");
		System.out.println("\t\t�¼� ����");
		PrintUtil.blank(1);
		
		for (int i = 0; i < (paramR.size()); i++) {
			if ((i + 1) % 3 == 0) {
				System.out.printf("\t  %-2s ", paramR.get(i).get("SEAT_SNO"));
				if (paramR.get(i).get("SEAT_REV").equals("T")) {
					System.out.println("��");
				} else {
					System.out.println("��");
				}
			} else {
				System.out.printf("\t  %-2s ", paramR.get(i).get("SEAT_SNO"));
				if (paramR.get(i).get("SEAT_REV").equals("T")) {
					System.out.print("��");
				} else {
					System.out.print("��");
				}
			}
		}

		PrintUtil.blank(1);
		PrintUtil.bar();
		System.out.println("\t\t\t\t0. �ڷΰ���");
		System.out.print("\t\t���� >> ");
		sno = ScanUtil.nextInt();
		if(sno>=0 && sno<21) {
			return sno;			
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			reservationRno();
			return View.RESERVATION_RNO;
		}
	}

	public int reserveSeat20(int rno) {
		sql = " SELECT * FROM SEAT WHERE SEAT_RNO = " + rno;
		paramR = jdbc.selectList(sql);
		PrintUtil.bar2();
		System.out.println("");
		System.out.println("\t\t�¼� ����");
		PrintUtil.blank(1);
		for (int i = 0; i < (paramR.size()); i++) {
			if ((i + 1) % 5 == 0) {
				System.out.printf("  %-2s ", paramR.get(i).get("SEAT_SNO"));
				if (paramR.get(i).get("SEAT_REV").equals("T")) {
					System.out.println("�� ");
				} else {
					System.out.println("�� ");
				}
			} else {
				if ((i + 1) % 5 == 1) {
					System.out.print("    ");
				}
				System.out.printf("  %-2s ", paramR.get(i).get("SEAT_SNO"));
				if (paramR.get(i).get("SEAT_REV").equals("T")) {
					System.out.print("�� ");
				} else {
					System.out.print("�� ");
				}
			}
		}

		PrintUtil.bar();
		System.out.println("\t\t\t\t0. �ڷΰ���"); 
		System.out.print("\t\t���� >> ");
		sno = ScanUtil.nextInt();

		if (sno >= 0 && sno < 21) {
			return sno;
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			reservationRno();
			return View.RESERVATION_RNO;
		}
	}

	public int reservationIn(int rno, int sno) {
		if (sno == 0) {
			System.out.println("\t�������� �ٽ� �����մϴ�.");
			reservationRno();
			return View.RESERVATION_RNO;
		} else {
			PrintUtil.bar2();
			System.out.println("");
			System.out.println("\t\t���� Ȯ��");
			PrintUtil.blank(2);
			System.out.println("\t" + rno + "�� " + sno + "���� �����Ͻðڽ��ϱ�?");
			PrintUtil.blank(2);
			PrintUtil.bar();
			System.out.println("\t\t\t\t0. �ڷΰ���");
			System.out.print("\t\t���� (Y/N) >> ");
			select = ScanUtil.nextLine();
			if (select.equalsIgnoreCase("y")) {
				sql = "UPDATE SEAT SET SEAT_REV='T' WHERE SEAT_RNO = " + rno + "AND SEAT_SNO = " + sno;
				rs = jdbc.update(sql);// rs�� 1�� ������ ���� �� �Ȱ�.. ǥ��?
				if (rs == 1) {
					System.out.println("\t������ �Ϸ�Ǿ����ϴ�. ó�� ȭ������ ���ư��ϴ�.");
					return View.HOME;
// �� SQL������ Reservation DB insert���ֱ�			sql = "UPDATE SEAT SET SEAT_REV='T' WHERE SEAT_RNO = " + rno + "AND SEAT_SNO = " + sno;
				} 
				
				else if (rs == 0) {
					System.out.println("\t�̹� ����� �¼��Դϴ�. �ٽ� �������ּ���.");
					reservationRno();
					return View.RESERVATION_RNO;
				} 
				
				else {
					System.out.println("\t�߸� �Է��ϼ̽��ϴ�. ���� ùȭ������ ���ư��ϴ�.");
					reservation();
					return View.RESERVATION;
				}
			} 
			
			else if (select.equalsIgnoreCase("n")) {
				System.out.println("\t�¼� ������ ����ϰ� ���� ùȭ������ ���ư��ϴ�.");
				reservation();
				return View.RESERVATION;
			} 
			
			else {
				System.out.println("\t�߸� �Է��ϼ̽��ϴ�. ���� ùȭ������ ���ư��ϴ�.");
				reservation();
				return View.RESERVATION;
			}
		}
		// y�� ������ T�� �ٲ��ְ� + reservation ��� �����ֱ�
	}

	// count, ȣ�Ǻ� F�� ������ ���� ��ȯ�ϴ� �޼ҵ�
	public int count (int rno) {
		sql = " SELECT SEAT_REV FROM SEAT WHERE SEAT_RNO = " + rno + " AND SEAT_REV = 'F'";
		if (jdbc.selectList(sql).size() == 0)
			return 0;
		else
			return (Integer) jdbc.selectList(sql).size();
//		Integer.parseInt((String)jdbc.selectOne(sql).get("COUNT(*)"));

	}

	public int reservationOut (int rno, int sno) {
		PrintUtil.bar2();
		System.out.println("");
		System.out.println("\t\t���� Ȯ��");
		PrintUtil.blank(2);
		System.out.println("\t" + rno + "�� " + sno + "���� ����Ͻðڽ��ϱ�?");
		PrintUtil.blank(2);
		PrintUtil.bar();
		System.out.println("\t\t\t\t0. �ڷΰ���");
		System.out.print("\t\t���� (Y/N) >> ");
		select = ScanUtil.nextLine();
		if (select.equalsIgnoreCase("y")) {
			sql = "UPDATE SEAT SET SEAT_REV='F' WHERE SEAT_RNO = " + rno + "AND SEAT_SNO = " + sno;
			rs = jdbc.update(sql);
			if (rs == 1) {
				System.out.println("\t����� �Ϸ�Ǿ����ϴ�. ó�� ȭ������ ���ư��ϴ�.");
				return View.HOME;
//�� SQL������ Reservation DB insert���ֱ�			sql = "UPDATE SEAT SET SEAT_REV='T' WHERE SEAT_RNO = " + rno + "AND SEAT_SNO = " + sno;
			} else if (rs == 0) {
				System.out.println("\t������� ���� �¼��Դϴ�. �ٽ� �������ּ���.");
				reservationRno();
				return View.RESERVATION_RNO;
			} else {
				System.out.println("\t�߸� �Է��ϼ̽��ϴ�. ���� ùȭ������ ���ư��ϴ�.");
				reservation();
				return View.RESERVATION;
			}
		} else if (select.equalsIgnoreCase("n")) {
			System.out.println("\t����� ����ϰ� ���� ùȭ������ ���ư��ϴ�.");
			reservation();
			return View.RESERVATION;
		} else {
			System.out.println("\t�߸� �Է��ϼ̽��ϴ�. ���� ùȭ������ ���ư��ϴ�.");
			reservation();
			return View.RESERVATION;
			}
		}
}
