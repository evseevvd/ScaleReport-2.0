import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {SearchResult} from './model/search.result.model';
import {Criteria} from './model/criteria.model';

@Injectable({
  providedIn: 'root'
})
export class SearchService {

  constructor(private http: HttpClient) { }

  public search(criteria: Criteria): Observable<SearchResult> {
    return this.http.post<SearchResult>('/api/search', criteria);
  }

  public searchAll(criteria: Criteria): Observable<SearchResult> {
    return this.http.post<SearchResult>('/api/search/all', criteria);
  }
}
