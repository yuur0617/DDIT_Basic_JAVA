package util;

public class LoadingUtil {
	
	static public void loadingTest(){
		PrintUtil.bar();
		PrintUtil.blank(11);;
		PrintUtil.printBar();
		ScanUtil.nextLine();
	}
	
	static public void loading(){
		String[] str = {"_","_","ㅇ_","오_","온_","오느_","오늘_","오늘 _","오늘 ㅜ_","오늘 ㅝ_","오늘 ㅜ_","오늘 _","오늘 ㅁ_","오늘 무_","오늘 뭐_","오늘 뭐 ㅁ_","오늘 뭐 머_","오늘 뭐 먹_"
				,"오늘 뭐 먹ㅈ_","오늘 뭐 먹지_","오늘 뭐 먹지_","오늘 뭐 먹지._","오늘 뭐 먹지.._","오늘 뭐 먹지..._","오늘 뭐 먹지...?　 "};
		String[] name1 = {"👨 _","👨 _","👨 ㅂ_","👨 바_","👨 박_","👨 밗_","👨 박세_","👨 박셓_","👨 박세혀_","👨 박세현"};
		String[] name2 = {"👩 _","👩 _","👩 ㅇ_","👩 유_","👩 윤_","👩 윥_","👩 윤지_","👩 윤짛_","👩 윤지혜"};
		String[] name3 = {"👦 _","👦 _","👦 ㅈ_","👦 저_","👦 정_","👦 정ㅇ_","👦 정이_","👦 정잇_","👦 정이사_",
				"👦 정이삭_","👦 정이삭_","👦 정이삭","👦 정이삭","👦 정이삭_","👦 정이삭_","👦 정이삭","👦 정이삭","👦 정이삭_","👦 정이삭_","👦 정이삭"};
		int n1=0 ,n2=0, n3=0;
		String pressEnter = "";
		String eyes =  " • _ •│      ";
		for(int i=0; i<str.length+name1.length+name2.length+name3.length; i++){
			String str_1 = "",name_1="",name_2 = "", name_3 = "";
		
			int j=i;
			if(j>str.length-1) j=str.length-1;
			str_1 = str[j];
			if(i>= str.length){ 
				if(n1>name1.length-1) n1=name1.length-1;
				name_1 = name1[n1++];			}
			if(i>= str.length+name1.length){
				if(n2>name2.length-1) n2=name2.length-1;
				name_2 = name2[n2++];			}
			if(i>= str.length+name1.length+name2.length){
				if(n3>name3.length-1) n3=name3.length-1;
				name_3 = name3[n3++];		}
			if(i==str.length+name1.length+name2.length+name3.length-1){
				Util.wait(200);
				eyes = " > _ <│      ";
				pressEnter = " 계속하려면 엔터키를 입력...";
			}

			Util.wait(150);
			System.out.println("\n\n\n□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■");
			System.out.println();
			System.out.println();
			System.out.println("      ╭∂∂∂∂∂∂╮    ╭──────────────╮                     ");
			System.out.println("      ε"+eyes+str_1);
			System.out.println("      ╰──┰┰──╯    ╰──────────────╯ ");
			System.out.println("      ╭──╲╱──╮");
			System.out.println("   ╞══╧══════╧═════════╡▒   "+name_1);
			System.out.println("   │　대덕인재개발원　302호　│▒   "+name_2);
			System.out.println("   └───────────────────┘▒   "+name_3);
			System.out.println("   ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒   ");
			System.out.println();
			System.out.print("□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■\n>"+pressEnter);  
		}
		ScanUtil.nextLine();
		
	}
	
	static public void mainUi(int select,String nickname){
		final int max = 1;
		int count = 0;
		String grade ="□" ,review = "□",distance ="□", serch ="□", order ="□",mypage ="□",board ="□";
		String page = "마이페이지";
		String adm = "도시락주문";
		if(nickname.equals("비회원")){page = "로그인";}
		if(nickname.equals("관리자")){page = "관리자전용";adm = "도시락관리";}
		
		String x ="";
		String a = "■";
		switch(select)
		{
		case 1 : grade =a;x = "평점순";break;
		case 2 : review =a;x = "리뷰수";break; 
		case 3 : distance =a;x = "거리순";break;
		case 4 : serch =a;x= "평점순";break;
		case 5 : order =a;break;
		case 6 : mypage =a;break;
		case 7 : board  =a;break;
		default : break;
		}


		for(int i = 1; i <6;i++){
			Util.wait(110);
			if(count == max){break;}

			if(i == 5){count++;i = 1;}
			if(i == 1){
				System.out.println("\n\n\n□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■\n\n"
						+ "                                    🍽️ 오늘 뭐먹지? 🍽️               "+nickname+"(으)로 접속중\n\n"
						+ "  "+grade+" 평점기준                   🥘 ["+x+"] BEST 5 🍝\n"
						+ "  "+review+" 리뷰수기준\n"
						+ "  "+distance+" 거리기준                	           ■ □\n"
						+ "  "+serch+" 검색                     	           □ □\n"
						+ "  "+order+" "+adm+"     \n"
						+ "  "+mypage+" "+page+"             \n"
						+ "  "+board+" 고객센터"
						+ "\n                           (2)↓ (5)↑ (⏎)확인\n"
						+ "□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■");}

			if(i == 2){
				System.out.println("\n\n\n□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■\n\n"
						+ "                                    🍽️ 오늘 뭐먹지? 🍽️               "+nickname+"(으)로 접속중\n\n"
						+ "  "+grade+" 평점기준                   🥘 ["+x+"] BEST 5 🍝\n"
						+ "  "+review+" 리뷰수기준\n"
						+ "  "+distance+" 거리기준                	           □ □\n"
						+ "  "+serch+" 검색                     	           ■ □\n"
						+ "  "+order+" "+adm+"     \n"
						+ "  "+mypage+" "+page+"             \n"
						+ "  "+board+" 고객센터"
						+ "\n                           (2)↓ (5)↑ (⏎)확인\n"
						+ "□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■");}

			if(i == 3){
				System.out.println("\n\n\n□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■\n\n"
						+ "                                    🍽️ 오늘 뭐먹지? 🍽️               "+nickname+"(으)로 접속중\n\n"
						+ "  "+grade+" 평점기준                   🥘 ["+x+"] BEST 5 🍝\n"
						+ "  "+review+" 리뷰수기준\n"
						+ "  "+distance+" 거리기준                	           □ □\n"
						+ "  "+serch+" 검색                     	           □ ■\n"
						+ "  "+order+" "+adm+"     \n"
						+ "  "+mypage+" "+page+"             \n"
						+ "  "+board+" 고객센터"
						+ "\n                           (2)↓ (5)↑ (⏎)확인\n"
						+ "□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■");}

			if(i == 4){
				System.out.println("\n\n\n□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■\n\n"
						+ "                                    🍽️ 오늘 뭐먹지? 🍽️               "+nickname+"(으)로 접속중\n\n"
						+ "  "+grade+" 평점기준                   🥘 ["+x+"] BEST 5 🍝\n"
						+ "  "+review+" 리뷰수기준\n"
						+ "  "+distance+" 거리기준                	           □ ■\n"
						+ "  "+serch+" 검색                     	           □ □\n"
						+ "  "+order+" "+adm+"     \n"
						+ "  "+mypage+" "+page+"             \n"
						+ "  "+board+" 고객센터"
						+ "\n                           (2)↓ (5)↑ (⏎)확인\n"
						+ "□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■");}
		}
	}



}