import { Component, OnInit } from '@angular/core';
import { Types } from '../interfaces/types';
import { BudgetService } from '../services/budget.service';


@Component({
  selector: 'app-expenses-list',
  templateUrl: './expenses-list.component.html',
  styleUrls: ['./expenses-list.component.css']
})
export class ExpensesListComponent implements OnInit {
  expenses: Types[] = [];

  constructor(private budgetService: BudgetService) { }

  ngOnInit(): void {
    this.expenses = this.budgetService.getExpenses();
    console.log(this.expenses)
  }

}
