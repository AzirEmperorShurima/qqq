package bt;

//import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList {
int[] arr = new int[0];
void add(int element) {
	int[] temp = new int[arr.length + 1];
	for(int i=0; i<arr.length; i++) {
		temp[i] = arr[i];
	}
	temp[arr.length] = element;
	arr=temp;
}
	
public int size() {
	return arr.length;
}

public int get(int index) {
	if(index < 0 || index >= size()) {
		System.out.println("Out of range");
		return 9999999;
	}else {
		for(int i=0; i<arr.length-1; i++) {
			if(i == index) {
				index = arr[i];
				break;
			}
		}
	}
	return index;
}

public void add(int index, int element) {
	if(index < 0 || index >= size()) {
		System.out.println("Out of range");
	}else {
		int[] m = new int[arr.length + 1];
		for(int i=0; i<arr.length; i++) {
			if(i < index)
				m[i] = arr[i];
			else
				m[i+1] = arr[i];
		}
		m[index] = element;
		arr = m;
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
	}
}

public boolean contains(int element) {
	boolean result = false;
	for(int i=0; i<arr.length; i++) {
		if(element == arr[i]) {
			result = true;
			break;
		}
	}
	return true;
}

//public void clear() {
//	boolean isRemoved = arr.removeAll(arr);
//	for (int i = 0; i < size(); i++)
//        arr[i] = ;
//}

public int indexOf(int element) {
	int result = -1;
	for(int i=0; i<arr.length; i++) {
		if(element == arr[i]) {
			result = i;
			break;
		}
	}
	return result;
}

public int lastindexOf(int element) {
	int result = -1;
	for(int i=arr.length-1; i>0; i--) {
		if(element == arr[i]) {
			result = i;
			break;
		}
	}
	return result;
}

public boolean isEmpty() {
	if(arr.length == 0) {
		return true;
	}
	return false;
}

public void remove(int index) {
	if(index < 0 || index >= size()) {
		System.out.println("Out of range");
	}else {
		int[] m = new int[arr.length - 1];
		for(int i=0; i<arr.length; i++) {
			if(i < index)
				m[i] = arr[i];
			if(i > index)
				m[i-1] = arr[i];
			if(i == index)
				continue;
		}
		System.out.println(Arrays.toString(m));
	}
}

public void removeElement(int element) {
	int[] m = new int[arr.length - 1];
	int count=0, dem=0;
	for(int i=0; i<arr.length; i++) {
		if(arr[i] != element) {
			count++;
		}else {
			break;
		}
	}
	for(int i=0; i<arr.length; i++) {
		if(i > count) {
			m[i-1] = arr[i];
		}
		if(i < count) {
			m[i] = arr[i];
		}
	}
	System.out.println(Arrays.toString(m));
}

public int[] set(int index,int element) {
	int[] m = new int[arr.length];
	if(index < 0 || index >= size()) {
		System.out.println("Out of range");
	}else {
		for(int i=0; i<arr.length; i++) {
			if(i == index) {
				m[i] = element;
			}else {
				m[i] = arr[i];
			}
		}
	}
	return m;
}

int[] subList(int fromIndex, int toIndex) {
	int[] result = new int[toIndex - fromIndex+1];
	for(int i=fromIndex; i<=toIndex; i++) {
		result[i-fromIndex] = arr[i];
	}
	return result;
}

public String toString() {
	String result = "[";
	for(int i=0; i<arr.length; i++) {
		if(i==arr.length-1)
			result += arr[i] + "]";
		else
			result += arr[i] + ", ";
	}
	return result;
}

}
