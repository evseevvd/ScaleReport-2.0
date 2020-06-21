import {Component, Input, OnInit} from '@angular/core';
import {Weight} from '../../service/model/weight.model';

@Component({
  selector: 'app-scale-table',
  templateUrl: './scale-table.component.html',
  styleUrls: ['./scale-table.component.scss']
})
export class ScaleTableComponent implements OnInit {

  @Input() weights: Map<Date, Array<Weight>>;

  displayedColumns: string[] = ['carNom', 'cargo', 'gross', 'tare', 'netto', 'dateGross', 'dateTare', 'loading',
    'unloading', 'sender', 'addressee', 'cargoCarrier'];

  constructor() {
  }

  ngOnInit() {
  }

  public showAdvanced($event, item) {

  }

}
