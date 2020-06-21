import {Component, Input, OnInit} from '@angular/core';
import {SearchResult} from '../../service/model/search.result.model';

@Component({
  selector: 'app-print-form',
  templateUrl: './print-form.component.html',
  styleUrls: ['./print-form.component.scss']
})
export class PrintFormComponent implements OnInit {
  @Input() data: SearchResult;
  constructor(

  ) { }

  ngOnInit() {
  }

}
