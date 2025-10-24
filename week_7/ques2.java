package week_7;

public class ques2 {
    public static void main(String[] args){
        String q = "in this world it's just us , you know it's not the same as it was";
        String[] sentence = q.split("\\s+");
        int max = sentence[0].length();
        int min = sentence[0].length();
        String finans = "";
        String finans2 = " ";
        for (int i=0;i<sentence.length ; i++){
            if(max < sentence[i].length()){
                max = sentence[i].length();
                finans = sentence[i];
            }
            if(min>sentence[i].length()){
                min = sentence[i].length();
                finans2 = sentence[i];
            }

        }
        //finans has the final ans 
        System.out.println("The longest word is : " + finans);
        System.out.println("The shortest word is : " + finans2);
        
    }
}
