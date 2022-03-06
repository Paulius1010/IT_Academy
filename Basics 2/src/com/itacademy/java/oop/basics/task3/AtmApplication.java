package com.itacademy.java.oop.basics.task3;

public class AtmApplication {
    public static void main(String[] args) {


        Card creditCard = new CreditCard(1500, "Deividas", "LT11", 2.5, 1000);
        Card debitCard = new DebitCard(2000, "Karolis", "LT22");

        MyBankAtm myBankAtm = new MyBankAtm();
        myBankAtm.setBalance(10000);

        try {
            myBankAtm.withdraw(creditCard, 2000);
            myBankAtm.withdraw(creditCard, 1000);
            creditCard.credit(3000);
            myBankAtm.withdraw(creditCard, 1000);
            myBankAtm.withdraw(debitCard, 1500);
            myBankAtm.withdraw(debitCard, 1500);
            debitCard.credit(2500);
            myBankAtm.withdraw(debitCard, 1500);
            creditCard.credit(4000);
            myBankAtm.withdraw(creditCard, 4500);
        } catch (NotEnoughtCreditException | NotEnoughBalanceException | InsuficientAtmFundsException e) {
            System.out.println(e.getMessage());
//            throw new RuntimeException();
        } finally {
            try {
                creditCard.credit(3000);
                myBankAtm.withdraw(creditCard, 1000);
                myBankAtm.withdraw(debitCard, 1500);
                myBankAtm.withdraw(debitCard, 1500);
                debitCard.credit(2500);
                myBankAtm.withdraw(debitCard, 1500);
                creditCard.credit(4000);
                myBankAtm.withdraw(creditCard, 4500);
            } catch (NotEnoughtCreditException | NotEnoughBalanceException | InsuficientAtmFundsException e) {
                System.out.println(e.getMessage());
//                throw new RuntimeException();
            } finally {
                try {
                    debitCard.credit(2500);
                    myBankAtm.withdraw(debitCard, 1500);
                    creditCard.credit(2000);
                    myBankAtm.withdraw(creditCard, 4500);
                } catch (NotEnoughtCreditException | NotEnoughBalanceException | InsuficientAtmFundsException e) {
                    System.out.println(e.getMessage());
//                    throw new RuntimeException();
                } finally {
                    try {
                        creditCard.credit(1000);
                        myBankAtm.withdraw(creditCard, 4500);
                    } catch (NotEnoughtCreditException | NotEnoughBalanceException | InsuficientAtmFundsException e) {
                        System.out.println(e.getMessage());
//                        throw new RuntimeException();
                    } finally {
                        System.out.println("Experiment is finished");
                    }
                }
            }
        }
    }
}
