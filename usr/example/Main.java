class Main {


    static int searchInSorted(int arr[], int N, int K)
    {
        int t = 0;
        while(N-- > 0){
            t = (arr[N] == K) ? 1: -1;    
        }
        return t;
	}

	
	public static void main(String[] args) {
		System.out.println("Helllo");

}