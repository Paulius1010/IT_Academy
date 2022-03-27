import { Injectable } from '@angular/core';
import {expensesList} from 'src/app/shared/DATA'
import {Expense} from "../shared/expense";
import {ActivatedRoute} from "@angular/router";

@Injectable({
  providedIn: 'root'
})
export class ExpensesService {

  constructor() { }

  private expenses = this.loadExpenses();

  loadExpenses(): Expense[]{
      return expensesList;
  }

  getExpenseById(id: String) {
    for (let expense of this.expenses){
      if (expense.id == id){
        return expense;
      }
    }
    return null;
  }

  getSum(): number{
    let number = 0
    this.expenses.forEach(function (expense) {
      number += parseFloat(expense.amount);
    })
    return number;
  }

}
