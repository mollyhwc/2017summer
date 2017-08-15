package Session8;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]={1,2,3};
		int arr2[]={1,2,3};
		change1(arr1);
		change2(arr2);
		System.out.println("arr1:");
		for(int i=0;i<3;i++){
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.println("arr2:");
		for(int i=0;i<3;i++){
			System.out.print(arr2[i]+" ");
		}
	}
	
	public static void change1(int []a){
		for(int b:a){
			if(b%2==0){
				b=0;
			}
		}
	}
	public static void change2(int []a){
		for(int i=0;i<a.length;i++){
			if(a[i]%2==0)
			{
				a[i]=0;
			}
		}
	}
}
