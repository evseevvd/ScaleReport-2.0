import {Component, ElementRef, Inject, OnInit, ViewChild} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material/dialog';
import {SearchResult} from '../../../service/model/search.result.model';
import {CriteriaComponent} from '../criteria/criteria.component';

@Component({
  selector: 'app-print-modal',
  templateUrl: './print-modal.component.html',
  styleUrls: ['./print-modal.component.scss']
})
export class PrintModalComponent implements OnInit {

  @ViewChild('printFrame') private printView: ElementRef;
  @ViewChild('content') content: ElementRef;

  constructor(
    public dialogRef: MatDialogRef<CriteriaComponent>,
    @Inject(MAT_DIALOG_DATA) public data: SearchResult) {
  }

  ngOnInit() {
  }

  public print() {
    const contentWindow = this.printView.nativeElement.contentWindow;
    const body = contentWindow.document;
    const content = this.content.nativeElement.innerHTML;
    body.open();
    body.write(content);
    body.close();
    contentWindow.focus();
    if (!contentWindow.document.execCommand('print', false, null)) {
      contentWindow.print();
    }
  }

  cancel() {
    this.dialogRef.close('reject');
  }
}
