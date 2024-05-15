package sample;

import java.util.concurrent.CompletableFuture;

public class CreditCardActivationPage {

    public static void main(String[] args) {
        // Simulating the process of sending details to the bank
        CompletableFuture<String> bankResponse = sendDetailsToBank();

        // Waiting for the response from the bank
        bankResponse.thenAccept(response -> {
            // Handle the bank's response here
            System.out.println("Received response from bank: " + response);
            // Redirect to the new page with the details provided by the bank
            redirectToNewPage(response);
        });

        // In the meantime, the program can do other tasks

        // Keep the program running until the response is received
        try {
            Thread.sleep(Long.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Simulate sending details to the bank and getting a response asynchronously
    private static CompletableFuture<String> sendDetailsToBank() {
        return CompletableFuture.supplyAsync(() -> {
            // Simulate processing time
            try {
                Thread.sleep(10000); // Simulating 2 seconds delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // Simulate receiving response from the bank
            return "Approved"; // Simulated bank response
        });
    }

    // Method to redirect to the new page with the bank response
    private static void redirectToNewPage(String response) {
        System.out.println("Redirecting to new page with bank response: " + response);
        // Redirect logic goes here
    }
}
