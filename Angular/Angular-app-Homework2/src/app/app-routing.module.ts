import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ExpenseDetailsComponent } from './expense-details/expense-details.component';
import { ExpensesListComponent } from "./expenses-list/expenses-list.component";
import { HomeComponent } from './home/home.component';


const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'expenses', component: ExpensesListComponent },
  { path: 'expenses/:id', component: ExpenseDetailsComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
