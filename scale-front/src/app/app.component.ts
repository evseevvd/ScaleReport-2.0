import {Component} from '@angular/core';
import {Criteria} from './service/model/criteria.model';
import {SearchService} from './service/search.service';
import {MatDialog} from '@angular/material/dialog';
import {CriteriaComponent} from './component/modal/criteria/criteria.component';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  criteria: Criteria;


  constructor(private service: SearchService, private dlg: MatDialog) {

  }

  public openSearchDlg() {
    this.dlg.open(CriteriaComponent, {width: '600px', data: {}}).afterClosed().subscribe(result => {
      if (result !== 'reject') {
        this.criteria = result;
        this.service.search(this.criteria).subscribe(res => {
          console.log(res);
        });
      }
    });
  }

  public search() {

  }
}
