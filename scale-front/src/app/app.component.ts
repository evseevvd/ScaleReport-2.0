import {Component, OnInit} from '@angular/core';
import {Criteria} from './service/model/criteria.model';
import {SearchService} from './service/search.service';
import {MatDialog} from '@angular/material/dialog';
import {CriteriaComponent} from './component/modal/criteria/criteria.component';
import {SearchResult} from './service/model/search.result.model';
import {PrintModalComponent} from './component/modal/print-modal/print-modal.component';
import {filter, switchMap, tap} from 'rxjs/operators';
import {Observable} from 'rxjs';
import {Weight} from './service/model/weight.model';
import {Moment} from 'moment';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {
  public criteria: Criteria;
  public weights: Map<Moment, Array<Weight>>;
  public total: SearchResult;
  private readonly itemPerPage: number = 100;


  constructor(
    private service: SearchService,
    private dlg: MatDialog) {
  }

  ngOnInit(): void {
  }

  public openSearchDlg() {
    this.dlg
      .open(CriteriaComponent, {width: '700px', hasBackdrop: false, data: {}})
      .afterClosed()
      .pipe(
        filter(r => r !== 'reject'),
        tap(r => this.criteria = r),
        switchMap(c => this.service.search(c))
      )
      .subscribe(result => {
        this.total = result;
        this.weights = result.weightAutos;
      });
  }

  public openPrintDlg() {
    this.dlg.open(PrintModalComponent, {width: '95%', data: this.total}).afterClosed().subscribe(() => {
    });
  }

  public isEmptyData() {
    return !this.weights || this.weights.size === 0;
  }

  public loadMore() {
    this.criteria.position = this.criteria.position + this.itemPerPage;
    this.service.search(this.criteria).subscribe(result => {
      result.weightAutos.forEach((v, k) => {
        this.weights.set(k, v);
      })
    });
  }
}
