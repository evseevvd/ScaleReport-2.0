import {Injectable} from '@angular/core';
import {Criteria} from './model/criteria.model';

@Injectable({
  providedIn: 'root'
})
export class CriteriaHolderService {

  private criteria: Criteria;

  public set(criteria: Criteria) {
    this.criteria = criteria;
  }

  public get(): Criteria {
    return this.criteria;
  }
}
