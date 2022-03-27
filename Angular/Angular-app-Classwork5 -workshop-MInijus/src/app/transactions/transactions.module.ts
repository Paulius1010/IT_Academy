import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { TransactionsRoutingModule } from './transactions-routing.module';
import { TransactionsComponent } from './transactions.component';
import { TransactionsPageComponent } from './components/transactions-page/transactions-page.component';

@NgModule({
  declarations: [TransactionsComponent, TransactionsPageComponent],
  imports: [CommonModule, TransactionsRoutingModule],
})
export class TransactionsModule {}
