import { Component, Input, OnInit, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-container',
  templateUrl: './container.component.html',
  styleUrls: ['./container.component.scss']
})
export class ContainerComponent implements OnInit {
  header: string = 'Container header from variable';
  @Input() congratulation: string = '';
  @Output() onClick: EventEmitter<MouseEvent> = new EventEmitter<MouseEvent>();
  constructor() { }

  ngOnInit(): void {
    // const body = document.querySelector('body');
    // if (body) {
    //   body.addEventListener('click', () => { console.log('body xx was clicked') })
    // }
  }

  handleContainerClick(event: MouseEvent) {
    console.log('paragraph was clicked', this.congratulation);
    this.onClick.emit(event);
  }

}
