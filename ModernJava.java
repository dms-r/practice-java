/**
 * ModernJava.java - A comprehensive guide to Java programming
 * 
 * This file demonstrates Java programming concepts from basic to advanced,
 * following modern best practices and showcasing newer language features.
 * 
 * @author Claude
 * @version 1.0
 * @since 2025-05-04
 */

// Package declaration should always come first
package com.example.javaguide;

// Imports are grouped and organized
// Standard library imports
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// Static imports should be used sparingly and only when they improve readability
import static java.lang.Math.PI;
import static java.lang.Math.max;
import static java.lang.System.out;

/**
 * Main class that demonstrates various Java concepts.
 * Each section is clearly marked and contains practical examples.
 */
public class ModernJava {

    /**
     * The main method serves as the entry point for the program.
     * This method demonstrates various Java concepts in a structured way.
     * 
     * @param args Command-line arguments (not used in this example)
     */
    public static void main(String[] args) {
        // Content is organized into sections for better readability
        demonstrateBasicInputOutput();
        demonstrateVariablesAndTypes();
        demonstrateOperators();
        demonstrateControlStructures();
        demonstrateCollections();
        demonstrateObjectOriented();
        demonstrateModernFeatures();
        demonstratePracticalExamples();
    }
    
    /**
     * Demonstrates basic input and output operations in Java.
     */
    private static void demonstrateBasicInputOutput() {
        out.println("\n=== INPUT/OUTPUT DEMONSTRATION ===");
        
        // Simple output examples
        out.println("Hello World!");
        out.println("Integer: " + 10 + " Double: " + 3.14 + " Boolean: " + true);
        
        // Formatted output with printf
        out.printf("Formatted number: %.2f%n", PI);
        
        // Text blocks (Java 15+) - great for multi-line text
        String htmlExample = """
                <html>
                    <body>
                        <h1>Text Blocks in Java</h1>
                        <p>Text blocks make multi-line strings easier to read.</p>
                    </body>
                </html>
                """;
        out.println("HTML example using text blocks:");
        out.println(htmlExample);
        
        // Input example (commented out to avoid blocking)
        /*
        Scanner scanner = new Scanner(System.in);
        out.print("Enter your name: ");
        String name = scanner.nextLine();
        out.println("Hello, " + name + "!");
        scanner.close();  // Always close resources
        */
        
        // File I/O with try-with-resources (Java 7+)
        // This automatically closes resources even if exceptions occur
        try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
            out.println("First line from file: " + reader.readLine());
        } catch (IOException e) {
            out.println("File not found or couldn't be read: " + e.getMessage());
        }
    }
    
    /**
     * Demonstrates Java variables and data types with practical examples.
     */
    private static void demonstrateVariablesAndTypes() {
        out.println("\n=== VARIABLES AND DATA TYPES ===");
        
        // Primitive types with practical uses
        byte fileType = 127;                           // File type identifier
        short yearManufactured = 2025;                 // Year a product was made
        int populationCount = 37_500_000;              // Population of a country
        long nationalDebt = 21_000_000_000_000L;       // National debt in dollars
        float itemPrice = 19.99f;                      // Price of a product
        double scientificCalculation = 1.6180339887;   // Golden ratio
        boolean isAvailable = true;                    // Product availability
        char grade = 'A';                              // Student grade
        
        // Type inference with var (Java 10+)
        var currentYear = 2025;         // Inferred as int
        var interestRate = 0.05;        // Inferred as double
        var message = "Hello";          // Inferred as String
        
        // Constants
        final double SPEED_OF_LIGHT = 299_792_458;  // meters per second
        
        // Wrapper classes provide useful methods
        Integer maxInt = Integer.MAX_VALUE;
        out.println("Maximum integer value: " + maxInt);
        
        // String operations - a practical example of email validation
        String email = "user@example.com";
        boolean isValidEmail = email.contains("@") && email.contains(".");
        out.println("Is email valid? " + isValidEmail);
        
        // StringBuilder for efficient string manipulation
        StringBuilder addressBuilder = new StringBuilder();
        addressBuilder.append("123 Main St, ");
        addressBuilder.append("Apartment 4B, ");
        addressBuilder.append("Springfield, XX 12345");
        String fullAddress = addressBuilder.toString();
        out.println("Full address: " + fullAddress);
        
        // BigDecimal for precise financial calculations
        BigDecimal price = new BigDecimal("19.99");
        BigDecimal quantity = new BigDecimal("3");
        BigDecimal total = price.multiply(quantity);
        out.println("Total cost: $" + total);  // $59.97 exactly, not 59.97000000000001
        
        // Modern date-time API (Java 8+)
        LocalDate today = LocalDate.now();
        LocalDateTime currentTime = LocalDateTime.now();
        out.println("Today's date: " + today);
        out.println("Current time: " + 
            currentTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }
    
    /**
     * Demonstrates Java operators with practical examples.
     */
    private static void demonstrateOperators() {
        out.println("\n=== OPERATORS ===");
        
        // Arithmetic operators in a shopping cart calculation
        double productPrice = 29.99;
        int quantity = 3;
        double subtotal = productPrice * quantity;
        double taxRate = 0.07;
        double tax = subtotal * taxRate;
        double total = subtotal + tax;
        
        out.println("Shopping Cart:");
        out.printf("Product: $%.2f × %d = $%.2f%n", productPrice, quantity, subtotal);
        out.printf("Tax (%.0f%%): $%.2f%n", taxRate * 100, tax);
        out.printf("Total: $%.2f%n", total);
        
        // Increment/decrement in inventory management
        int stockQuantity = 100;
        out.println("Initial stock: " + stockQuantity);
        out.println("After selling one item: " + (--stockQuantity));
        out.println("After receiving shipment: " + (stockQuantity += 10));
        
        // Comparison operators for age verification
        int userAge = 19;
        int requiredAge = 18;
        boolean canAccess = userAge >= requiredAge;
        out.println("User is " + userAge + ". Can access adult content? " + canAccess);
        
        // Logical operators for loan approval
        int creditScore = 720;
        double income = 65000.0;
        boolean hasGoodCredit = creditScore > 700;
        boolean hasEnoughIncome = income > 50000.0;
        boolean isApproved = hasGoodCredit && hasEnoughIncome;
        out.println("Loan application approved? " + isApproved);
        
        // Ternary operator for responsive design
        int screenWidth = 1200;
        String displayMode = (screenWidth > 768) ? "Desktop" : "Mobile";
        out.println("Display mode: " + displayMode);
        
        // Bitwise operators (practical for permission systems)
        int READ = 4;     // 100 in binary
        int WRITE = 2;    // 010 in binary
        int EXECUTE = 1;  // 001 in binary
        
        int userPermissions = READ | WRITE;  // 110 in binary (6)
        out.println("User permissions: " + userPermissions);
        out.println("Can read? " + ((userPermissions & READ) > 0));
        out.println("Can execute? " + ((userPermissions & EXECUTE) > 0));
    }
    
    /**
     * Demonstrates Java control structures with practical examples.
     */
    private static void demonstrateControlStructures() {
        out.println("\n=== CONTROL STRUCTURES ===");
        
        // If-else for order processing
        double orderTotal = 120.0;
        out.println("Order Total: $" + orderTotal);
        
        if (orderTotal > 100) {
            out.println("You qualify for free shipping!");
        } else if (orderTotal > 50) {
            out.println("Shipping cost: $5.99");
        } else {
            out.println("Shipping cost: $9.99");
        }
        
        // Switch expression (Java 14+) for payment methods
        String paymentMethod = "CREDIT";
        String paymentFee = switch(paymentMethod) {
            case "CREDIT" -> "2.5% transaction fee";
            case "DEBIT" -> "1% transaction fee";
            case "PAYPAL" -> "3% transaction fee";
            case "CRYPTO" -> "0% transaction fee";
            default -> "Unknown payment method";
        };
        out.println("Payment method: " + paymentMethod);
        out.println("Fee structure: " + paymentFee);
        
        // Enhanced switch statement (Java 12+) for HTTP status codes
        int httpStatus = 404;
        switch (httpStatus) {
            case 200, 201, 202 -> out.println("HTTP Request Successful");
            case 400, 401, 403, 404 -> out.println("HTTP Request Failed: " + httpStatus);
            case 500, 502, 503 -> out.println("Server Error");
            default -> out.println("Unknown HTTP Status");
        }
        
        // For loop for a countdown timer
        out.println("Countdown:");
        for (int i = 5; i > 0; i--) {
            out.println(i + "...");
        }
        out.println("Launch!");
        
        // While loop for retry logic
        int maxRetries = 5;
        int retryCount = 0;
        boolean connectionSuccessful = false;
        
        while (!connectionSuccessful && retryCount < maxRetries) {
            retryCount++;
            // Simulate connection attempt
            connectionSuccessful = (Math.random() > 0.7);
            out.println("Connection attempt " + retryCount + ": " + 
                (connectionSuccessful ? "Success" : "Failed"));
        }
        
        // Enhanced for loop (for-each) for iterating orders
        List<String> orders = List.of("ORD-001", "ORD-002", "ORD-003");
        out.println("Processing orders:");
        for (String order : orders) {
            out.println("Processing: " + order);
        }
        
        // Do-while for user input validation (simulated)
        int userRating = 0;
        boolean validInput = false;
        
        do {
            // Simulate getting user input (1-5)
            userRating = (int)(Math.random() * 6) + 1;
            validInput = (userRating >= 1 && userRating <= 5);
            if (!validInput) {
                out.println("Invalid rating: " + userRating + ". Please enter 1-5.");
            }
        } while (!validInput);
        
        out.println("Thank you for your rating: " + userRating);
    }
    
    /**
     * Demonstrates Java collections with practical examples.
     */
    private static void demonstrateCollections() {
        out.println("\n=== COLLECTIONS ===");
        
        // Arrays - storing fixed data like months
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        out.println("Third month: " + months[2]);  // March (zero-indexed)
        
        // Multi-dimensional arrays - for a tic-tac-toe game board
        char[][] gameBoard = {
            {'X', 'O', 'X'},
            {'O', 'X', 'O'},
            {'O', ' ', 'X'}
        };
        out.println("Tic-tac-toe board center: " + gameBoard[1][1]);
        
        // ArrayList - dynamic collection for a shopping cart
        List<String> shoppingCart = new ArrayList<>();
        shoppingCart.add("Laptop");
        shoppingCart.add("Mouse");
        shoppingCart.add("Keyboard");
        out.println("Shopping cart contains: " + shoppingCart);
        out.println("Cart items: " + shoppingCart.size());
        
        // Factory methods for immutable collections (Java 9+)
        List<String> productCategories = List.of("Electronics", "Clothing", "Books", "Food");
        Set<String> availableShippingMethods = Set.of("Standard", "Express", "Same-day");
        Map<String, Double> currencyExchangeRates = Map.of(
            "USD", 1.0,
            "EUR", 0.91,
            "GBP", 0.78,
            "JPY", 153.2
        );
        
        out.println("Available shipping methods: " + availableShippingMethods);
        out.println("USD to EUR rate: " + currencyExchangeRates.get("EUR"));
        
        // HashMap for a user database
        Map<String, User> users = new HashMap<>();
        users.put("john123", new User("John Doe", "john@example.com"));
        users.put("alice456", new User("Alice Smith", "alice@example.com"));
        
        String username = "john123";
        if (users.containsKey(username)) {
            User user = users.get(username);
            out.println("Found user: " + user.getName() + " (" + user.getEmail() + ")");
        } else {
            out.println("User not found");
        }
        
        // Using forEach with lambda expressions
        out.println("All users:");
        users.forEach((key, user) -> 
            out.println(key + ": " + user.getName())
        );
    }
    
    /**
     * Demonstrates Java object-oriented programming concepts with practical examples.
     */
    private static void demonstrateObjectOriented() {
        out.println("\n=== OBJECT-ORIENTED PROGRAMMING ===");
        
        // Creating objects
        Product laptop = new Product("MacBook Pro", 1999.99, 10);
        out.println("Product: " + laptop.getName() + ", Price: $" + laptop.getPrice());
        
        // Apply discount
        laptop.applyDiscount(15);  // 15% discount
        out.println("After discount: $" + laptop.getPrice());
        
        // Inheritance example
        DigitalProduct ebook = new DigitalProduct(
            "Java Programming Guide", 29.99, 1000, "PDF", 5.2);
        out.println("Digital product: " + ebook.getName());
        out.println("File size: " + ebook.getFileSizeMB() + "MB");
        
        // Polymorphism example
        Product[] cart = {
            new Product("Headphones", 149.99, 20),
            new DigitalProduct("Photoshop", 20.99, 500, "EXE", 2500),
            new Product("Mouse Pad", 9.99, 100)
        };
        
        double cartTotal = 0;
        for (Product item : cart) {
            out.println(item.getName() + ": $" + item.getPrice());
            cartTotal += item.getPrice();
            
            // Using instanceof pattern matching (Java 16+)
            if (item instanceof DigitalProduct digitalItem) {
                out.println("  File format: " + digitalItem.getFileFormat());
            }
        }
        out.println("Cart total: $" + cartTotal);
        
        // Interface example
        PaymentProcessor creditCardProcessor = new CreditCardProcessor();
        creditCardProcessor.processPayment(cartTotal);
        
        // Abstract class example
        Vehicle car = new Car("Toyota", "Camry", 2025, 4);
        car.startEngine();
        car.displayInfo();
        
        // Record example (Java 14+)
        CustomerRecord customer = new CustomerRecord("Jane Doe", "jane@example.com", 5);
        out.println("Customer: " + customer.name() + ", Loyalty level: " + customer.loyaltyLevel());
    }
    
    /**
     * Demonstrates modern Java features with practical examples.
     */
    private static void demonstrateModernFeatures() {
        out.println("\n=== MODERN JAVA FEATURES ===");
        
        // Optional for null handling (Java 8+)
        Map<String, String> userPreferences = new HashMap<>();
        userPreferences.put("theme", "dark");
        
        // Without Optional
        String fontSize = userPreferences.get("fontSize");
        String fontSizeDisplay = (fontSize != null) ? fontSize : "default";
        
        // With Optional
        String theme = Optional.ofNullable(userPreferences.get("theme"))
            .orElse("light");
        
        out.println("Theme setting: " + theme);
        out.println("Font size setting: " + fontSizeDisplay);
        
        // Stream API (Java 8+) for data processing
        List<String> productNames = List.of(
            "Laptop", "Smartphone", "Tablet", "Smartwatch", "Headphones"
        );
        
        // Filter products starting with 'S'
        List<String> sProducts = productNames.stream()
            .filter(name -> name.startsWith("S"))
            .collect(Collectors.toList());
        
        out.println("Products starting with 'S': " + sProducts);
        
        // Convert to uppercase and join with commas
        String uppercaseProducts = productNames.stream()
            .map(String::toUpperCase)
            .collect(Collectors.joining(", "));
        
        out.println("All products: " + uppercaseProducts);
        
        // Calculating statistics from numeric data
        List<Double> prices = List.of(29.99, 9.99, 5.49, 499.99, 19.95);
        DoubleSummaryStatistics stats = prices.stream()
            .mapToDouble(Double::doubleValue)
            .summaryStatistics();
        
        out.println("Price statistics:");
        out.println("  Count: " + stats.getCount());
        out.println("  Average: $" + stats.getAverage());
        out.println("  Min: $" + stats.getMin());
        out.println("  Max: $" + stats.getMax());
        out.println("  Sum: $" + stats.getSum());
        
        // Lambda expressions and functional interfaces
        // Predicate - tests a condition
        Predicate<String> isLongPassword = password -> password.length() >= 8;
        out.println("Is 'pass123' a long password? " + isLongPassword.test("pass123"));
        
        // Function - transforms input to output
        Function<Double, String> formatPrice = price -> 
            String.format("$%.2f", price);
        out.println("Formatted price: " + formatPrice.apply(9.99));
        
        // Consumer - performs an action on input
        Consumer<String> logger = message -> out.println("LOG: " + message);
        logger.accept("User login successful");
        
        // Supplier - provides a value
        Supplier<String> transactionId = () -> 
            "TXN-" + (int)(Math.random() * 10000);
        out.println("Generated transaction ID: " + transactionId.get());
        
        // Sealed classes (Java 17+)
        out.println("Payment types available: " + 
            Arrays.toString(PaymentMethod.values()));
        
        // Pattern matching for switch (Java 17+ preview)
        Object obj = "Hello World";
        String description = patternMatchingSwitch(obj);
        out.println("Object description: " + description);
    }
    
    /**
     * Pattern matching for switch (Java 17+ preview feature)
     */
    private static String patternMatchingSwitch(Object obj) {
        return switch (obj) {
            case String s -> "String of length " + s.length();
            case Integer i -> "Integer with value " + i;
            case Double d -> "Double with value " + d;
            case Long l -> "Long with value " + l;
            case null -> "null value";
            default -> "Unknown type";
        };
    }
    
    /**
     * Demonstrates more practical examples using Java features.
     */
    private static void demonstratePracticalExamples() {
        out.println("\n=== PRACTICAL EXAMPLES ===");
        
        // Example 1: Simple authentication system
        out.println("1. Authentication System Example");
        AuthenticationService authService = new AuthenticationService();
        
        // Register users
        authService.register("alice", "password123");
        authService.register("bob", "securepass");
        
        // Login attempts
        out.println("Login for alice: " + 
            authService.login("alice", "password123"));
        out.println("Login for bob (wrong password): " + 
            authService.login("bob", "wrongpass"));
        out.println("Login for unknown user: " + 
            authService.login("eve", "evepass"));
        
        // Example 2: Data transformation with streams
        out.println("\n2. Data Processing Example");
        List<SalesRecord> sales = List.of(
            new SalesRecord("Electronics", 799.99),
            new SalesRecord("Books", 49.95),
            new SalesRecord("Electronics", 1299.99),
            new SalesRecord("Clothing", 129.50),
            new SalesRecord("Books", 24.99),
            new SalesRecord("Clothing", 89.99)
        );
        
        // Group sales by category and calculate total
        Map<String, Double> salesByCategory = sales.stream()
            .collect(Collectors.groupingBy(
                SalesRecord::category,
                Collectors.summingDouble(SalesRecord::amount)
            ));
        
        out.println("Sales by category:");
        salesByCategory.forEach((category, total) -> 
            out.printf("  %s: $%.2f%n", category, total)
        );
        
        // Example 3: Task scheduler using enums
        out.println("\n3. Task Scheduler Example");
        TaskScheduler scheduler = new TaskScheduler();
        
        scheduler.scheduleTask("Send welcome email", TaskPriority.HIGH);
        scheduler.scheduleTask("Update inventory", TaskPriority.MEDIUM);
        scheduler.scheduleTask("Archive old records", TaskPriority.LOW);
        
        scheduler.processTasks();
    }
}

/**
 * A simple user class representing a system user.
 */
class User {
    private String name;
    private String email;
    
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
    
    public String getName() {
        return name;
    }
    
    public String getEmail() {
        return email;
    }
}

/**
 * A product class representing items for sale.
 */
class Product {
    private String name;
    private double price;
    private int stockQuantity;
    
    public Product(String name, double price, int stockQuantity) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public int getStockQuantity() {
        return stockQuantity;
    }
    
    public void applyDiscount(double percentDiscount) {
        if (percentDiscount > 0 && percentDiscount <= 100) {
            price = price * (1 - percentDiscount / 100);
        }
    }
    
    public boolean isAvailable() {
        return stockQuantity > 0;
    }
}

/**
 * A subclass of Product for digital goods.
 */
class DigitalProduct extends Product {
    private String fileFormat;
    private double fileSizeMB;
    
    public DigitalProduct(String name, double price, int stockQuantity, 
                         String fileFormat, double fileSizeMB) {
        super(name, price, stockQuantity);
        this.fileFormat = fileFormat;
        this.fileSizeMB = fileSizeMB;
    }
    
    public String getFileFormat() {
        return fileFormat;
    }
    
    public double getFileSizeMB() {
        return fileSizeMB;
    }
    
    @Override
    public boolean isAvailable() {
        // Digital products are always available if in stock
        return getStockQuantity() > 0;
    }
}

/**
 * Payment processor interface for different payment methods.
 */
interface PaymentProcessor {
    boolean processPayment(double amount);
    default void sendReceipt(String email) {
        System.out.println("Sending receipt to " + email);
    }
}

/**
 * Credit card payment implementation.
 */
class CreditCardProcessor implements PaymentProcessor {
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
        // Payment gateway integration would go here
        return true;
    }
}

/**
 * PayPal payment implementation.
 */
class PayPalProcessor implements PaymentProcessor {
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
        // PayPal API integration would go here
        return true;
    }
    
    @Override
    public void sendReceipt(String email) {
        System.out.println("Sending PayPal receipt to " + email);
    }
}

/**
 * Abstract vehicle class showing inheritance hierarchy.
 */
abstract class Vehicle {
    private String make;
    private String model;
    private int year;
    
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    public String getMake() {
        return make;
    }
    
    public String getModel() {
        return model;
    }
    
    public int getYear() {
        return year;
    }
    
    // Abstract method - all vehicles must implement
    public abstract void startEngine();
    
    // Concrete method - common for all vehicles
    public void displayInfo() {
        System.out.println(year + " " + make + " " + model);
    }
}

/**
 * Car class extending Vehicle.
 */
class Car extends Vehicle {
    private int doors;
    
    public Car(String make, String model, int year, int doors) {
        super(make, model, year);
        this.doors = doors;
    }
    
    public int getDoors() {
        return doors;
    }
    
    @Override
    public void startEngine() {
        System.out.println("Starting car engine...");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Car, Doors: " + doors);
    }
}

/**
 * A record for immutable customer data (Java 14+).
 */
record CustomerRecord(String name, String email, int loyaltyLevel) {
    // Additional methods can be added
    public boolean isPremium() {
        return loyaltyLevel >= 3;
    }
}

/**
 * An enum for payment methods with additional data and behavior.
 */
enum PaymentMethod {
    CREDIT_CARD(2.5, "Credit Card"),
    DEBIT_CARD(1.0, "Debit Card"),
    PAYPAL(3.0, "PayPal"),
    CRYPTO(0.0, "Cryptocurrency"),
    BANK_TRANSFER(0.5, "Bank Transfer");
    
    private final double feePercentage;
    private final String displayName;
    
    PaymentMethod(double feePercentage, String displayName) {
        this.feePercentage = feePercentage;
        this.displayName = displayName;
    }
    
    public double calculateFee(double amount) {
        return amount * (feePercentage / 100);
    }
    
    public String getDisplayName() {
        return displayName;
    }
    
    @Override
    public String toString() {
        return displayName;
    }
}

/**
 * A record for sales data.
 */
record SalesRecord(String category, double amount) {}

/**
 * Task priority enum for the scheduler example.
 */
enum TaskPriority {
    HIGH(1, "High Priority"),
    MEDIUM(2, "Medium Priority"),
    LOW(3, "Low Priority");
    
    private final int level;
    private final String description;
    
    TaskPriority(int level, String description) {
        this.level = level;
        this.description = description;
    }
    
    public int getLevel() {
        return level;
    }
    
    public String getDescription() {
        return description;
    }
}

/**
 * A task scheduler example using enums and priority queues.
 */
class TaskScheduler {
    private final Map<TaskPriority, List<String>> tasksByPriority = new HashMap<>();
    
    public TaskScheduler() {
        // Initialize lists for each priority level
        for (TaskPriority priority : TaskPriority.values()) {
            tasksByPriority.put(priority, new ArrayList<>());
        }
    }
    
    public void scheduleTask(String taskDescription, TaskPriority priority) {
        tasksByPriority.get(priority).add(taskDescription);
        System.out.println("Scheduled: " + taskDescription + " (" + priority.getDescription() + ")");
    }
    
    public void processTasks() {
        System.out.println("Processing tasks in priority order:");
        
        // Process tasks in order of priority
        for (TaskPriority priority : TaskPriority.values()) {
            List<String> tasks = tasksByPriority.get(priority);
            if (!tasks.isEmpty()) {
                System