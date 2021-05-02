class TestReturnArray{

    /*static int[] get(){
        return new int[]{10,30,50,90,60};
    }

    public static void main(String args[]){

        int arr[]=get();

        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }*/
    public static void main(String args[]){

        int arr[][]={{1,2,3},{2,4,5},{4,4,5}};

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

