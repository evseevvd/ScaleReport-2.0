import {Component} from '@angular/core';
import {Criteria} from './service/model/criteria.model';
import {SearchService} from './service/search.service';
import {MatDialog} from '@angular/material/dialog';
import {CriteriaComponent} from './component/modal/criteria/criteria.component';
import {Weight} from './service/model/weight.model';
import {SearchResult} from './service/model/search.result.model';
import {PrintFormComponent} from './component/print-form/print-form.component';
import {PrintModalComponent} from './component/modal/print-modal/print-modal.component';

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
    this.dlg.open(CriteriaComponent, {width: '700px', hasBackdrop: false, data: {}}).afterClosed().subscribe(result => {
      if (result !== 'reject') {
        this.criteria = result;
        this.service.search(this.criteria).subscribe(res => {
          this.results = res;
        });
      }
    });
  }

  public openPrintDlg() {
    this.dlg.open(PrintModalComponent, {width: '95%', data: this.results}).afterClosed().subscribe(() => {
    });
  }

  public isEmptyData() {
    return !!this.results;
  }
}
