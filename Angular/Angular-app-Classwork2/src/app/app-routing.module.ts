import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BudgetsComponent } from './budgets/budgets.component';
import { ExpenseDetailsComponent } from './expense-details/expense-details.component';
import { ExpensesComponent } from './expenses/expenses.component';
import { FilterExpenseGuard } from './guards/filter-expense.guard';
import { HomeComponent } from './home/home.component';
import { PageNotFounComponent } from './page-not-foun/page-not-foun.component';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'expenses', component: ExpensesComponent },
  { path: 'expenses/:id', component: ExpenseDetailsComponent, canActivate: [FilterExpenseGuard] },
  { path: 'budgets', component: BudgetsComponent },
  { path: '**', component: PageNotFounComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule { }
