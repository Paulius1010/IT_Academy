import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Types } from '../interfaces/types';
import { BudgetService } from '../services/budget.service';

@Component({
  selector: 'app-expense-details',
  templateUrl: './expense-details.component.html',
  styleUrls: ['./expense-details.component.css']
})
export class ExpenseDetailsComponent implements OnInit {
  expense: Types | undefined;
  id: string | null = '';

  constructor(private activatedRoute: ActivatedRoute, private budgetService: BudgetService) { }

  ngOnInit(): void {
    this.id = this.activatedRoute.snapshot.paramMap.get('id');
    if (this.id) {
      this.expense = this.budgetService.getExpense(this.id);
    }
  }

}
