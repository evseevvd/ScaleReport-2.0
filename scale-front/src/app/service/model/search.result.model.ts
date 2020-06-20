import {Weight} from './weight.model';

export interface SearchResult {
  weightAutos: Array<Weight>;
  totalResult: number;
  itemPerPage: number;
  position: number;
  totalGross: number;
  totalNetto: number;
  totalTare: number;
}
