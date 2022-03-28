import { Component, Input, OnInit, Output, EventEmitter } from '@angular/core';
import { Router } from '@angular/router';
import { Types } from '../interfaces/types';

@Component({
  selector: 'app-expense-overview',
  templateUrl: './expense-overview.component.html',
  styleUrls: ['./expense-overview.component.css']
})
export class ExpenseOverviewComponent implements OnInit {
  @Input() expense!: Types;
  @Output() onClick: EventEmitter<MouseEvent> = new EventEmitter<MouseEvent>();

  constructor(private router: Router) { }

  ngOnInit(): void {
  }

  onClickExpense(event: MouseEvent, expense: Types): void {
    console.log('was clicked on expense with id ' + this.expense.id);
    this.router.navigate(['/expenses/', this.expense.id]);
    this.onClick.emit(event);
  }

}
