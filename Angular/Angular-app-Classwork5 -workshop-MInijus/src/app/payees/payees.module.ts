import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { PayeesRoutingModule } from './payees-routing.module';
import { PayeesComponent } from './payees.component';

@NgModule({
  declarations: [PayeesComponent],
  imports: [CommonModule, PayeesRoutingModule],
})
export class PayeesModule {}
