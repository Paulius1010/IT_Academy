import { Injectable } from '@angular/core';
import { expensesList } from '../expense';
import { Types } from '../interfaces/types';

@Injectable({
  providedIn: 'root'
})
export class BudgetService {
  expenses: Types[];

  constructor() {
    this.expenses = expensesList;
  }

  getExpenses(): Types[] {
    return this.expenses;
  }

  getExpense(id: string): Types | undefined {
    return this.expenses.find(item => item.id === id);
  }


}
