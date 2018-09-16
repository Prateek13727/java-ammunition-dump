public class Main {
	public static void main(String[] args){
		HashTable hashTable = new HashTable(19);
		hashTable.insert("Apple");
		hashTable.insert("Dog");
		hashTable.insert("Banana");
		hashTable.insert("Mango");
		hashTable.insert("Cat");
		hashTable.insert("Horse");
		hashTable.insert("Cow");
		hashTable.insert("Pig");

		hashTable.displayHashTable();

		System.out.println(hashTable.find("Cow"));
	}	
}
