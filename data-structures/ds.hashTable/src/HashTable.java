public class HashTable {
	private String[] hashArray;
	private int arraySize;
	private int size;
	
	public HashTable(int noOfSlots) {
		size = 0;
		if(!isPrime(noOfSlots)) {
			noOfSlots = findNextPrime(noOfSlots);
		}
		hashArray = new String[noOfSlots];
		arraySize = noOfSlots;
	}

	public void insert(String word){
		int hashValue = hashFunc1(word);
		int stepSize = hashFunc2(word);
		while(hashArray[hashValue] != null) {
			hashValue += stepSize;
			hashValue %= arraySize; 
		}
		hashArray[hashValue] = word;
		size++;
	}

	public String find(String word){
		int hashValue = hashFunc1(word);
		int stepSize = hashFunc2(word);
		while(!hashArray[hashValue].equals(word)) {
			hashValue += stepSize;
			hashValue %= arraySize;
		}
		return hashArray[hashValue];
	}

	public void displayHashTable(){
		for(int i=0; i<hashArray.length; i++){
			if(hashArray[i] != null) {
				System.out.println(hashArray[i]);	
			} else {
				System.out.println("**");
			}
		}
	}

	private int hashFunc1(String word){
		int hashValue = word.hashCode();
		hashValue %= arraySize;
		if(hashValue < 0) {
			hashValue += arraySize;
		}
		return hashValue;
	}

	private int hashFunc2(String word){
		int hashValue = word.hashCode();
		hashValue %= arraySize;
		if(hashValue < 0) {
			hashValue += arraySize;
		}
		//prime number like 3, 7 should be used 
		return 7 - hashValue % 7;	
	}

	private int findNextPrime(int minNumber){	
		for(int i=minNumber; true; i++){
			if(isPrime(i)){
				return i;
			}
		}
	}

	private boolean isPrime(int number){
		for(int i=2; i*i < number; i++){
			if(number%i == 0) {
				return false;
			}
		}
		return true;
	}
}