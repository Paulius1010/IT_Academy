import { Component, OnInit } from '@angular/core';
import {ExpensesService} from "../services/expenses.service";
import {Expense} from "../shared/expense";

@Component({
  selector: 'app-expenses',
  templateUrl: './expenses.component.html',
  styleUrls: ['./expenses.component.css']
})
export class ExpensesComponent implements OnInit {
  constructor(private expensesService: ExpensesService) { }

  expenses?: Expense[];
  sum?: number;

  ngOnInit(): void {
    this.expenses = this.expensesService.loadExpenses();
    this.sum = this.expensesService.getSum();
  }

}
