package InsertionSort;

public class InsertionSort<E> {

	Integer[] Data;

	public Integer[] getData() {
		// TODO Auto-generated method stub
		return Data;
	}

	public void setData(Integer[] intArray) {
		this.Data = intArray;
		
	}

	public void sort(Integer[] intArray) {
		int j;

        for( int p = 1; p < intArray.length; p++ )
        {
            Integer tmp = intArray[ p ];
            for( j = p; j > 0 && tmp.compareTo( intArray[ j - 1 ] ) < 0; j-- )
            	intArray[ j ] = intArray[ j - 1 ];
            intArray[ j ] = tmp;
        }
	}


}
