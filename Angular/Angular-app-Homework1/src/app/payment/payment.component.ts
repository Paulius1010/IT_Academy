import { Component, Input, OnInit, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-payment',
  templateUrl: './payment.component.html',
  styleUrls: ['./payment.component.css']
})
export class PaymentComponent implements OnInit {
  @Input() paymentName: string = '';
  @Input() paymentAmount: number = 0;
  @Output() onClick: EventEmitter<MouseEvent> = new EventEmitter<MouseEvent>();

  constructor() { }

  ngOnInit(): void {
  }

  handleClick(event: MouseEvent) {
    ++this.paymentAmount;
    console.log('Payment amount is: ', this.paymentAmount);
    this.onClick.emit(event);
  }

}
