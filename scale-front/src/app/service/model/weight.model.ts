import {Moment} from 'moment';

export interface Weight {
  id: number;
  carNom: string;
  inWarehouse: number;
  dateTare: Moment;
  tare: number;
  dateGross: Moment;
  gross: number;
  netto: number;
  tareJpg1: string;
  tareJpg2: string;
  tareJpg3: string;
  tareJpg4: string;
  grossJpg1: string;
  grossJpg2: string;
  grossJpg3: string;
  grossJpg4: string;
  cargoCarrier: string;
  loading: string;
  unloading: string;
  cargo: string;
  addressee: string;
  sender: string;
  driver: string;
  carType: string;
  route: number;
  bortNom: string;
  birka: string;
  timeFrame: string;
  date: Moment;
  payer: string;
  tareDetect: string;
  grossDetect: string;
  grossStage1: number;
  tareStage1: number;
  incr: number;
  dumpJpg1: string;
  dumpJpg2: string;
  zolnost: String;
  plast: string;
  idID: number;
}
