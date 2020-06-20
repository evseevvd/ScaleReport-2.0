import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DirectoryService {

  constructor(private http: HttpClient) { }

  public getAllCarNom(): Observable<any> {
    return this.http.get('/api/carnom');
  }

  public findCarNom(carNum): Observable<any> {
    return this.http.get(`/api/find/car/${carNum}`);
  }

  public getAllLoading(): Observable<any> {
    return this.http.get(`/api/loading`);
  }

  public getAllUnloading(): Observable<any> {
    return this.http.get(`/api/unloading`);
  }

  public getAllCargo(): Observable<any> {
    return this.http.get(`/api/cargo`);
  }

  public getAllCargoCarrier(): Observable<any> {
    return this.http.get(`/api/cargocarrier`);
  }

  public getAllAddressee(): Observable<any> {
    return this.http.get(`/api/addressee`);
  }

  public getAllSender(): Observable<any> {
    return this.http.get(`/api/sender`);
  }

  public getAllTimeFrames(): Observable<any> {
    return this.http.get(`/api/smena`);
  }
}
