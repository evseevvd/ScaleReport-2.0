import {Component} from '@angular/core';
import {Criteria} from './service/model/criteria.model';
import {SearchService} from './service/search.service';
import {MatDialog} from '@angular/material/dialog';
import {CriteriaComponent} from './component/modal/criteria/criteria.component';
import {Weight} from './service/model/weight.model';
import {SearchResult} from './service/model/search.result.model';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  public criteria: Criteria;
  public results: SearchResult;


  constructor(private service: SearchService, private dlg: MatDialog) {

  }

  public openSearchDlg() {
    this.dlg.open(CriteriaComponent, {width: '700px', data: {}}).afterClosed().subscribe(result => {
      if (result !== 'reject') {
        this.criteria = result;
        this.service.search(this.criteria).subscribe(res => {
          this.results = res;
        });
      }
    });
  }

  public search() {

  }

  public isEmptyData() {
    return !!this.results;
  }
}
