import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {HomeComponent} from "./home/home.component";
import {ExpensesComponent} from "./expenses/expenses.component";
import {BudgetsComponent} from "./budgets/budgets.component";
import {PageNoFoundComponent} from "./page-not-found/page-no-found.component";
import {ExpenseDetailsComponent} from "./expenses/expense-details/expense-details.component";
import {FilterExpenseGuard} from "./guards/filter-expense.guard";

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'expenses', component: ExpensesComponent },
  { path: 'expenses/:id', component: ExpenseDetailsComponent},
  { path: 'budgets/:id', component: BudgetsComponent},
  { path: 'budgets', component: BudgetsComponent },
  { path: '**', component: PageNoFoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
