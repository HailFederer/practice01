package practice01;

public class Prob5 {
	public static void main(String[] args) {
		
		String st;
		for(int i=1; i<10000; i++){
			
			st = Integer.toString(i);
			
			if(st.contains("3") || st.contains("6") || st.contains("9")){
				
				String clap = "";
				String separateNum = null;
				for(int j=0; j<st.length(); j++){

					separateNum = st.substring(j, j+1);
					if("3".equals(separateNum) || "6".equals(separateNum) || "9".equals(separateNum)){
						clap += "짝";
					}
				}
				System.out.print(st+" "+clap+"\n");
			}
		}
	}
}