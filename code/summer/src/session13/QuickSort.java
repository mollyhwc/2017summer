package session13;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int array[]={32, 12, 7, 78, 23, 45};
	        quickSort(array,0,array.length-1);
	        System.out.println(Arrays.toString(array));
	}
	
	 public static void quickSort(int array[],int left,int right)
	    {
	        if(left>=right)
	        {
	            return ;
	        }
	        int i=left;
	        int j=right;
	        int key=array[left];
	        while(i<j)
	        {
	            while(i<j&&array[j]>key)
	            {
	                j--;
	            }
	            array[i]=array[j];
	            //�Ӻ���ǰ�ҵ���һ����keyС������array[i]������
	            while(i<j&&array[i]<key)
	            {
	                i++;
	            }
	            array[j]=array[i];
	            //��ǰ�����ҵ���һ����key�������array[j]������
	        }
	        array[i]=key;
	        //һ�˿���֮���Ѿ���key��λ���ҵ���
	        quickSort(array,left,i-1);
	        //��key��ߵĽ�������
	        quickSort(array,i+1,right);
	        //��key�ұߵĽ�������
	    }

}
