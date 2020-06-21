import {Component, Input, OnInit} from '@angular/core';
import {Weight} from '../../service/model/weight.model';
import {SearchResult} from '../../service/model/search.result.model';

@Component({
  selector: 'app-scale-table',
  templateUrl: './scale-table.component.html',
  styleUrls: ['./scale-table.component.scss']
})
export class ScaleTableComponent implements OnInit {

  @Input() result: SearchResult;

  constructor() {
  }

  ngOnInit() {
  }

  public showAdvanced($event, item) {

  }

}
