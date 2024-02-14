public class pattern {
    public static void main(String args[]){
        char ch = 'a';

        for(int i = 1;i <=4 ; i++){         //line
            for(int j = 1; j<=i ;j++){
                System.out.print(ch);
                ch++;   
            } 
            System.out.print("\n");
        }
    }
    
}
