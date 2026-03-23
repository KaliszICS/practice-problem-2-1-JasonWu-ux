public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static int find(int[] array, int number) {
		if (array == null) {
			return -1;
			}
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				return i;
			}
		}
	return -1;

	}
public static int findLast(String[] array, String string) {
    if (array == null || string == null) {
        return -1;
    }
    
    for (int i = array.length - 1; i >= 0; i--) {
        
        if (string.equals(array[i])) {
            return i;
        }
    }
    
    return -1;
	}
	public static int findSecond(char[] array, char character) {
		int count = 0;
		int firstcountindex = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == character) {
				count++;
				if (count == 1) {
					firstcountindex = i;
				} else if (count == 2) {
					return i;
				}
			}
		}
		if (count == 1) {
			return firstcountindex;

		} else {
			return -1;
		}
	}
	public static int[] findAll(double[] array, double number) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				count++;
			}
		}

		int[] result = new int [count];
		int resultIndex = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				result[resultIndex++] = i;
			}
		}
		return result;
	}
}