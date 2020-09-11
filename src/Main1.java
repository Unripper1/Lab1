class Main1{
    public static void main(String[] args){
        int n=10;
        int sum1=0;
        int sum2=0;
        int sum3=0;
        int[] mas= new int[n];

        for(int i=0;i<n;i++){
            mas[i]=i;
        };

        for(int i=0;i<n;i++){
            sum1+=mas[i];
        };
        int j=0;

        while(j<n){
            sum2+=mas[j];
            j++;
        };
        int i=0;

        do{
            sum3+=mas[i];
            i++;
        }while(i<n);

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }
}