package com.itacademy.java.oop.basics;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LoansApplication {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Chris", "Roland", 29, 39212126569L);
        List<Loan> loans = new ArrayList<Loan>();
        customer1.setLoans(loans);
        Loan loan1 = new Loan(LoanType.LEASING, 60000, 100125, LocalDate.parse("2023-02-23"));
//        LoanType newLoanType = LoanType.LEASING;
//        newLoanType.getLoanType();
        Loan loan2 = new Loan(LoanType.CONSUMER_LOAN, 10000, 100126, LocalDate.parse("2022-09-23"));

        customer1.getLoans().add(loan1);
        customer1.getLoans().add(loan2);

        Integer totalDebt=0;
        for (Loan loan : loans) {
            totalDebt+=loan.getAmount();
        }


        System.out.println("Customer " + customer1.getName() + " has loans: " + customer1.getLoans() + ". Total amount: " + totalDebt + ".");

    }
}
