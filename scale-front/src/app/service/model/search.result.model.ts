import {Weight} from './weight.model';
import {Moment} from 'moment';

export interface SearchResult {
  weightAutos: Map<Moment, Array<Weight>>;
  totalResult: number;
  itemPerPage: number;
  position: number;
  totalGross: number;
  totalNetto: number;
  totalTare: number;
}

export function searchResultInit() {
  return {
    totalTare: 0,
    totalNetto: 0,
    totalGross: 0,
    totalResult: 0,
    itemPerPage: 0,
    weightAutos: new Map<Moment, Array<Weight>>(),
    position: 0
  }
}
