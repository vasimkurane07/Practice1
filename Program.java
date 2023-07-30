using System;

class Program
{
    static void Main()
    {
        int[] array = { 64, 34, 25, 12, 22, 11, 90 };

        Console.WriteLine("Select a sorting algorithm:");
        Console.WriteLine("1. Insertion Sort");
        Console.WriteLine("2. Bubble Sort");

        Console.Write("Enter your choice (1 or 2): ");
        int choice = int.Parse(Console.ReadLine());

        switch (choice)
        {
            case 1:
                InsertionSort(array);
                break;
            case 2:
                BubbleSort(array);
                break;
            default:
                Console.WriteLine("Invalid choice!");
                break;
        }

        // Print the sorted array
        Console.WriteLine("Sorted array:");
        foreach (int num in array)
        {
            Console.Write(num + " ");
        }
    }

    // Insertion Sort implementation
    static void InsertionSort(int[] arr)
    {
        int n = arr.Length;
        for (int i = 1; i < n; i++)
        {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key)
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // Bubble Sort implementation
    static void BubbleSort(int[] arr)
    {
        int n = arr.Length;
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = 0; j < n - i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
