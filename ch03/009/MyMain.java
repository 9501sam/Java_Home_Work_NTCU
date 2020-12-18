//t o g d
//too+too+too+too = good
public class MyMain{
	public static void main(String args[]){
		int t = 0, o = 0, g = 0, d = 0;
		boolean flag = false;
		for(t = 0; t <= 9; t++){
			for(o = 0; o <= 9; o++){
				for(g = 0; g <= 9; g++){
					for(d  = 0; d <= 9; d++){
						if(t==o || t==g || t==d || o==g || o==d || g==d)continue;
						if(4*(t * 100 + o * 11) == g * 1000 + o * 110 + d)flag = true;
						if(flag)break;
					}
					if(flag)break;
				}
				if(flag)break;
			}
			if(flag)break;
		} 

		System.out.print("T = " + t + " O = " + o + " G = " + g + " D = " + d);
	}
}
