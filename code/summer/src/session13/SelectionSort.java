package session13;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] v = {1,2,4,5,9};
			for(int i=0; i<v.length-1; i++){
		            int min = v[i]; 
		            int temp;
		            int index = i;
		            for(int j=i+1;j<v.length;j++){
		                if(v[j] < min){ 
		                    min = v[j]; 
		                    index = j;
		                }       
		            }       
		    
		            temp = v[i]; 
		            v[i] = min;
		            v[index]= temp;
		    }
			for(int item:v){
				System.out.println(item);
			}
	}

}
