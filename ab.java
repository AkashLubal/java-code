class Demo{
	public static void main(String[]args){
		int Num = 5;
	
	int count = 0;
	for(int i = 1;i<=Num;i++){
	
	if(Num%i==0){
		count++;
	    }
	}
	if(count==2){

	System.out.println(" prime");
	}else{
	System.out.println("not prime");
	}
    }
  }