import {Component, EventEmitter, Input, OnChanges, OnInit, Output, SimpleChanges} from '@angular/core';
import {SearchResult} from '../../service/model/search.result.model';
import {Weight} from '../../service/model/weight.model';
import {Moment} from 'moment';
import {MatDialog} from '@angular/material/dialog';
import {CarViewComponent} from '../modal/car-view/car-view.component';

@Component({
  selector: 'app-scale-table',
  templateUrl: './scale-table.component.html',
  styleUrls: ['./scale-table.component.scss']
})
export class ScaleTableComponent implements OnInit, OnChanges {

  @Input() weights: Map<Moment, Array<Weight>>;
  @Input() total: SearchResult;
  @Output() loadMore: EventEmitter<any> = new EventEmitter<any>();

  constructor(private dlg: MatDialog) {
  }

  ngOnInit() {

  }

  public showAdvanced($event, item: Weight) {
    const imgs = [
      item.tareJpg1,
      item.tareJpg2,
      item.tareJpg3,
      item.tareJpg4,
      item.grossJpg1,
      item.grossJpg2,
      item.grossJpg3,
      item.grossJpg4
    ];
    this.dlg
      .open(CarViewComponent, {width: '600px', data: imgs})
      .afterClosed()
      .subscribe(() => {});
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
