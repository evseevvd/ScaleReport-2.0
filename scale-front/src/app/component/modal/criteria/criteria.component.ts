import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material/dialog';
import {Criteria, setFirstTimeFrame, setSecondTimeFrame, setZeroTime} from '../../../service/model/criteria.model';
import {DirectoryService} from '../../../service/directory.service';
import {Observable} from 'rxjs';
import {CriteriaHolderService} from '../../../service/criteria.holder.service';

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

  public query: string;



  constructor(
    public dialogRef: MatDialogRef<CriteriaComponent>,
    @Inject(MAT_DIALOG_DATA) public data: Criteria,
    private service: DirectoryService,
    private criteriaHolder: CriteriaHolderService
  ) { }

  ngOnInit() {
    if (this.criteriaHolder.get()) {
      this.data = this.criteriaHolder.get();
      // this.ctxSerach(this.data.carNom[0]);
    }
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
    switch (this.data.smena) {
      case 'Смена 1': setFirstTimeFrame(this.data); break;
      case 'Смена 2': setSecondTimeFrame(this.data); break;
    }
    if (this.data.startDate.isSame(this.data.endDate) && !this.data.smena) {
      setZeroTime(this.data);
    }
    this.criteriaHolder.set(this.data);
    this.dialogRef.close(this.data);
  }

  cancel() {
    this.dialogRef.close('reject');
  }

  clear() {
    this.data = {
      endDate: null,
      startDate: null,
      smena: null,
      loading: null,
      unloading: null,
      carNom: [],
      cargo: [],
      cargoCarrier: null,
      addressee: null,
      sender: null,
      route: null,
      itemPerPage: null,
      position: null,
    };
    this.criteriaHolder.set(this.data);
  }
}
