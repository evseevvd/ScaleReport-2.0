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
