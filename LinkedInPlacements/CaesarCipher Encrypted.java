static void caesarCipher(){
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        for(int i=0;i<n;i++){
			int num=(int)s.charAt(i);
			if( num>=65 && num<=90 ){
				num=num-k;
				if(num<65){
					num=65-num;
					while(num>26){
						num=num-26;
					}
					num=91-num;
				}
			}
			System.out.print(Character.toString((char)num));
		}
	}
