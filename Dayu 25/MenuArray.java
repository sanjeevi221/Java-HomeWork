import java.util.Scanner;
class MenuArray
 {

    Scanner sc = new Scanner(System.in);
    int[] arr = new int[6];

    void EnterElement()
	{
        for (int i = 0; i < 6; i++)
		{
            arr[i] = sc.nextInt();
        }
    }

   
   
    void displayElement()
	{
        for (int i = 0; i < 6; i++)
		{
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    void BubbleSort()
	{
        for (int i = 0; i < 5; i++)
		{
            for (int j = 0; j < 5 - i; j++)
			{
                if (arr[j] > arr[j + 1])
				{
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Array sorted successfully.");
    }

    
    int LinearSearch(int searchValue)
	{
        for (int i = 0; i < 10; i++)
		{
            if (arr[i] == searchValue) {
                return i;   
            }
        }
        return -1;         
    }

    
    void menu() {
        int choice;

        do {
            System.out.println("\n1. Enter The Element");
            System.out.println("2. Display The Element");
            System.out.println("3. Sort array");
            System.out.println("4. Search element");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice)
			{
                case 1:
					System.out.println("Enter 6 elements:");
                    EnterElement();
                    break;

                case 2:
					System.out.print("Array elements: ");
                    displayElement();
                    break;

                case 3:
                    BubbleSort();
                    break;

                case 4:
                    System.out.print("Enter element to search: ");
                    int searchValue = sc.nextInt();
                    int result = LinearSearch(searchValue);

                    if (result != -1)
                        System.out.println("Element found at index: " + result);
                    else
                        System.out.println("Element not found");
                    break;

                default:
                    
            }
        } while (choice != 5);
    }
	
	
	

    public static void main(String[] args)
	{
        MenuArray obj = new MenuArray();
        obj.menu();
    }
}