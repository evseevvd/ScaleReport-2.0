import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {ScaleTableComponent} from './component/scale-table/scale-table.component';
import {CriteriaComponent} from './component/modal/criteria/criteria.component';
import {PrintFormComponent} from './component/print-form/print-form.component';
import {MatTableModule} from '@angular/material/table';
import {MatButtonModule} from '@angular/material/button';
import {MatSelectModule} from '@angular/material/select';
import {MatInputModule} from '@angular/material/input';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatGridListModule} from '@angular/material/grid-list';
import {MatDividerModule} from '@angular/material/divider';
import {HttpClientModule} from '@angular/common/http';
import {MatListModule} from '@angular/material/list';
import {MatDialogModule} from '@angular/material/dialog';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {
  DateAdapter,
  MAT_DATE_FORMATS,
  MAT_DATE_LOCALE,
  MatDateFormats,
  MatNativeDateModule
} from '@angular/material/core';
import {FormsModule} from '@angular/forms';
import {MatAutocompleteModule} from '@angular/material/autocomplete';
import { PrintModalComponent } from './component/modal/print-modal/print-modal.component';
import {MomentDateAdapter} from '@angular/material-moment-adapter';
import { CarViewComponent } from './component/modal/car-view/car-view.component';

export const DATE_FORMATS: MatDateFormats = {
  parse: {
    dateInput: 'l'
  },
  display: {
    dateInput: 'DD.MM.YYYY',
    monthYearLabel: 'MMM YYYY',
    dateA11yLabel: 'LL',
    monthYearA11yLabel: 'MMMM YYYY'
  }
};

@NgModule({
  declarations: [
    AppComponent,
    ScaleTableComponent,
    PrintFormComponent,
    CriteriaComponent,
    PrintModalComponent,
    CarViewComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatTableModule,
    MatButtonModule,
    MatSelectModule,
    MatInputModule,
    MatFormFieldModule,
    MatGridListModule,
    MatDividerModule,
    MatListModule,
    MatDialogModule,
    MatDatepickerModule,
    MatNativeDateModule,
    FormsModule,
    MatAutocompleteModule
  ],
  providers: [
    {provide: MAT_DATE_LOCALE, useValue: 'ru-RU'},
    {provide: DateAdapter, useClass: MomentDateAdapter, deps: [MAT_DATE_LOCALE]},
    {provide: MAT_DATE_FORMATS, useValue: DATE_FORMATS},
  ],
  entryComponents: [CriteriaComponent, PrintModalComponent, CarViewComponent],
  bootstrap: [AppComponent]
})
export class AppModule { }
