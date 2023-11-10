import { Destino } from "./destinoModel";
import { Origen } from "./origenModel";

export interface Salida{
    id_frecuencia: number,
    frecuencia: string,
    origen: Origen[],
    destino: Destino[]
}