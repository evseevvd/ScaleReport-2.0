import {Component, Input, OnInit} from '@angular/core';

@Component({
  selector: 'app-car-view',
  templateUrl: './car-view.component.html',
  styleUrls: ['./car-view.component.scss']
})
export class CarViewComponent implements OnInit {

  @Input() imgs: string[];

  constructor() { }

  ngOnInit() {
  }

}
