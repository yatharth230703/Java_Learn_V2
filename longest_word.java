public class longest_word {
    public static void main(String[] args){
        //longest word 
        String[] list = {"Striver" , "Opti" , "Google" , "Dubai" , "choco" , "milk" , "lasagna" , "zoarastrian" };
        int max_size = list[0].length();
        String ans = " ";
        for(int i=0;i<list.length ; i++){
            if(max_size < list[i].length()){
                max_size = list[i].length();
                ans = list[i];
            }
        }
        System.out.println("longest string among given stuff is : " + ans + " of size " + max_size );


    }    
}
