package week_7;

public class ques3 {
    public static void main(String[] args){
        String q = "can't read my poker face";
        String r = "";
        //System.out.println(q.charAt(4));
        for (int i=q.length()-1 ; i>=0 ; i--){
            r+=q.charAt(i);
        }
        System.out.println(r);
        String[] splitted = r.split("\\s+");
        String[] reversi  = new String[splitted.length];
        for(int i=0;i<splitted.length ; i++){
            String temp ="";
            for(int j=splitted[i].length()-1 ; j>=0; j--){
                temp+=splitted[i].charAt(j);
            }
            reversi[i] = temp;
        }
        String finans = "";
        for (int i=0;i<reversi.length ; i++){
            finans+=reversi[i];
            finans+=" ";
        }
        System.out.println(finans);

    }
}
