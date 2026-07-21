import java.util.Arrays;
import java.util.Comparator;

public class SearchTest {

    public static Product linearSearch(Product[] products, int id) {
        for (Product product : products) {
            if (product.productId == id) {
                return product;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, int id) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (products[mid].productId == id) {
                return products[mid];
            } else if (products[mid].productId < id) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product(103, "Laptop", "Electronics"),
                new Product(101, "Mobile", "Electronics"),
                new Product(105, "Shoes", "Fashion"),
                new Product(102, "Watch", "Accessories"),
                new Product(104, "Bag", "Fashion")
        };

        int searchId = 104;

        System.out.println("Linear Search");

        Product result = linearSearch(products, searchId);

        if (result != null) {
            result.display();
        } else {
            System.out.println("Product not found");
        }

        Arrays.sort(products, Comparator.comparingInt(product -> product.productId));

        System.out.println();

        System.out.println("Binary Search");

        result = binarySearch(products, searchId);

        if (result != null) {
            result.display();
        } else {
            System.out.println("Product not found");
        }

        System.out.println();

        System.out.println("Analysis");
        System.out.println("Linear Search Time Complexity:");
        System.out.println("Best Case: O(1)");
        System.out.println("Average Case: O(n)");
        System.out.println("Worst Case: O(n)");

        System.out.println();

        System.out.println("Binary Search Time Complexity:");
        System.out.println("Best Case: O(1)");
        System.out.println("Average Case: O(log n)");
        System.out.println("Worst Case: O(log n)");

        System.out.println();

        System.out.println("Binary Search is more suitable for an e-commerce platform because it provides faster searching when the products are stored in sorted order.");
    }
}