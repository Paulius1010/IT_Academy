import { Component, OnInit } from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import {ExpensesService} from "../../services/expenses.service";
import {Expense} from "../../shared/expense";

@Component({
  selector: 'app-expense-details',
  templateUrl: './expense-details.component.html',
  styleUrls: ['./expense-details.component.css']
})
export class ExpenseDetailsComponent implements OnInit {

  constructor(private activatedRoute: ActivatedRoute,
              private expensesService: ExpensesService) { }

  expense?: Expense | null;

  ngOnInit(): void {
    const id = this.activatedRoute.snapshot.paramMap.get('id');
    // @ts-ignore
    this.expense = this.expensesService.getExpenseById(id);
  }

}
