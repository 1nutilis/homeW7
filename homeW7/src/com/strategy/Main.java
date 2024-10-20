package com.strategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите способ оплаты: 1 - Банковская карта ,2 - PayPal, 3 - Криптовалюта");
        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Выберите сумму: ");
        double amount = scanner.nextDouble();



        switch (choice) {
            case 1:
                context.setPaymentStrategy(new CreditCardPayment());
                break;
            case 2:
                context.setPaymentStrategy(new PayPalPayment());
                break;
            case 3:
                context.setPaymentStrategy(new CryptoPayment());
                break;
            default:
                System.out.println("Неверный выбор. Попробуйте снова.");
                return;
        }

        context.processPayment(amount);
    }
}
