import {Component, EventEmitter, Input, OnChanges, OnInit, Output, SimpleChanges} from '@angular/core';
import {SearchResult} from '../../service/model/search.result.model';
import {Weight} from '../../service/model/weight.model';
import {Moment} from 'moment';

@Component({
  selector: 'app-scale-table',
  templateUrl: './scale-table.component.html',
  styleUrls: ['./scale-table.component.scss']
})
export class ScaleTableComponent implements OnInit, OnChanges {

  @Input() weights: Map<Moment, Array<Weight>>;
  @Input() total: SearchResult;
  @Output() loadMore: EventEmitter<any> = new EventEmitter<any>();

  constructor() {
  }

  ngOnInit() {

  }

  public showAdvanced($event, item) {

  }

  public more(event) {
    if (this.isEndOfScroll(event.target)) {
      this.loadMore.emit({position: 100});
    }
  }

  private isEndOfScroll(target) {
    return target.offsetHeight + target.scrollTop >= target.scrollHeight
  }

  ngOnChanges(changes: SimpleChanges): void {

  }

}
