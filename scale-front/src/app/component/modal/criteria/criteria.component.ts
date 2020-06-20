import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material/dialog';
import {Criteria} from '../../../service/model/criteria.model';
import {DirectoryService} from '../../../service/directory.service';
import {map} from 'rxjs/operators';
import {Observable} from 'rxjs';

@Component({
  selector: 'app-criteria',
  templateUrl: './criteria.component.html',
  styleUrls: ['./criteria.component.scss']
})
export class CriteriaComponent implements OnInit {

  public smenaDS: Observable<any>;
  public carsDS: Observable<any>;
  public loadingDS: Observable<any>;
  public unloadingDS: Observable<any>;
  public cargoDS: Observable<any>;
  public cargoCarrierDS: Observable<any>;
  public addresseeDS: Observable<any>;
  public senderDS: Observable<any>;



  constructor(
    public dialogRef: MatDialogRef<CriteriaComponent>,
    @Inject(MAT_DIALOG_DATA) public data: Criteria,
    private service: DirectoryService
  ) { }

  ngOnInit() {
    this.smenaDS = this.service.getAllTimeFrames();
    //this.carsDS = this.service.getAllCarNom();
    this.loadingDS = this.service.getAllLoading();
    this.unloadingDS = this.service.getAllUnloading();
    this.addresseeDS = this.service.getAllAddressee();
    this.cargoDS = this.service.getAllCargo();
    this.cargoCarrierDS = this.service.getAllCargoCarrier();
    this.senderDS = this.service.getAllSender();
  }

  public ctxSerach(val) {
    if (val.length >= 3) {
      this.carsDS = this.service.findCarNom(val);
    }
  }

  apply() {
    this.data.position = 0;
    this.data.itemPerPage = 100;
    this.dialogRef.close(this.data);
  }

  cancel() {
    this.dialogRef.close('reject');
  }
}
