sadfsedfscpublic static int fibonacci(int number){
    if(number == 1 || number == 2){ //base case
        return 1;
    }
    return fibonacci(number-1) + fibonacci(number -2); 
}  
public static void main(String args[]) {
    int number = new Scanner(System.in).nextInt();
    for(int i=1; i<=number; i++){
        System.out.print(fibonacci2(i) +" ");
    }    
}


this is the setteings used in the style of sourcetree



this is another commit i m pushing