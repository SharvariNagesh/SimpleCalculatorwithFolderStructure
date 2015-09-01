package sn.cal;

public class simpleCal {
	public int calculator(String[] args) {
		// TODO Auto-generated method stub
		int a = 0,c = 0;
		if(args.length > 1){
			for(int i = 0; i< args.length; i++){
				a = Integer.parseInt(args[i]);
				c = c+a;
					
			}
			 
		}
		return c;

	}

}
