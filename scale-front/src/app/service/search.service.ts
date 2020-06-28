import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {SearchResult, searchResultInit} from './model/search.result.model';
import {Criteria} from './model/criteria.model';
import {map} from 'rxjs/operators';
import {Weight} from './model/weight.model';
import {Moment} from 'moment';

@Injectable({
  providedIn: 'root'
})
export class SearchService {

  constructor(private http: HttpClient) { }

  public search(criteria: Criteria): Observable<SearchResult> {
    return this.http.post('/api/search', criteria).pipe(map((response: any) => {
      const result: SearchResult = searchResultInit();
      result.itemPerPage = response.itemPerPage;
      result.totalResult = response.totalResult;
      result.totalGross = response.totalGross;
      result.totalNetto = response.totalNetto;
      result.totalTare = response.totalTare;
      response.weightAutos.forEach(w => this.insert2map(result.weightAutos, w));
      return result;
    }));
  }

  public searchAll(criteria: Criteria): Observable<SearchResult> {
    return this.http.post<SearchResult>('/api/search/all', criteria);
  }

  private insert2map(map: Map<Moment, Array<Weight>>, val: any) {
    if (map.get(val.date)) {
      map.set(val.date, map.get(val.date).concat(val));
    } else {
      map.set(val.date, [val]);
    }
  }
}
