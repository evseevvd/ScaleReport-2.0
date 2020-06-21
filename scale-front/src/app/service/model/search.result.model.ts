import {Weight} from './weight.model';

export interface SearchResult {
  weightAutos: Map<Date, Array<Weight>>;
  totalResult: number;
  itemPerPage: number;
  position: number;
  totalGross: number;
  totalNetto: number;
  totalTare: number;
}
