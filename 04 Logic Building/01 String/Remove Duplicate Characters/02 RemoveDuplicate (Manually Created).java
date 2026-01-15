public class RemoveDuplicate {
    public static void main(String[] args){
        System.out.println("Application Started....");
        String str = "Riyaz Khan Pathan";
        String result = "";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(result.indexOf(ch) == -1){
                result += ch;
            }
        }
        System.out.println("Result: " + result);
    }
    
}
