import { Component, Input, OnInit, Output, EventEmitter } from '@angular/core';


@Component({
  selector: 'app-serverx',
  templateUrl: './serverx.component.html',
  styleUrls: ['./serverx.component.scss']
})
export class ServerxComponent implements OnInit {
  header: string = 'Serverx header from variable';

  @Input() text: string = '';
  @Output() onClick: EventEmitter<MouseEvent> = new EventEmitter<MouseEvent>();
  constructor() { }

  ngOnInit(): void {
  }

  handleServerxClick(event: MouseEvent) {
    console.log('paragraph was clicked', this.text);
    this.onClick.emit(event);
  }

}
