import {Moment} from 'moment';

export interface Criteria {
  endDate: Moment;
  startDate: Moment;
  smena: string;
  loading: string;
  unloading: string;
  carNom: Array<string>;
  cargo: Array<string>;
  cargoCarrier: string;
  addressee: string;
  sender: string;
  route: string;
  itemPerPage: number;
  position: number;
}

export function setFirstTimeFrame(criteria: Criteria) {
  if (criteria.startDate) {
    criteria.startDate.set({hour:8,minute:0,second:0,millisecond:0});
  }
  if (criteria.endDate) {
    criteria.endDate.set({hour: 19, minute: 59, second: 59, millisecond: 0});
  }
}

export function setSecondTimeFrame(criteria: Criteria) {
  if (criteria.startDate) {
    criteria.startDate.set({hour: 20, minute: 0, second: 0});
  }
  if (criteria.endDate) {
    criteria.endDate.add('day', 1);
    criteria.endDate.set({hour: 7, minute: 59, second: 59});
  }
}

export function setZeroTime(criteria: Criteria) {
  if (criteria.startDate) {
    criteria.startDate.set({hour: 0, minute: 0, second: 0});
  }
  if (criteria.endDate) {
    criteria.endDate.set({hour: 23, minute: 59, second: 59});
  }

}
