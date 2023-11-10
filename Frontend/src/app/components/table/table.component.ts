import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Salida } from 'src/app/Models/SalidaModel';
import { Origen } from 'src/app/Models/origenModel';
import { Destino } from 'src/app/Models/destinoModel';

@Component({
  selector: 'app-table',
  templateUrl: './table.component.html',
  styleUrls: ['./table.component.css']
})
export class TableComponent {
  datos: Salida[] = [
    {
      id_frecuencia: 0,
      frecuencia: "",
      origen: [
        {
          id_sitio: 0,
          id_frecuencia: 0,
          frecuencia: "",
          ruta: "",
          sitio: "",
          id_servicio: ""
        }
      ],
      destino: [
        {
          id_sitio: 0,
          id_frecuencia: 0,
          frecuencia: "",
          ruta: "",
          sitio: "",
          id_servicio: ""
        },
      ]
    }
  ];
  constructor(private http:HttpClient){}

  ngOnInit(): void {
    const jsonFile = 'assets/Json/json_resultado.json';

    this.http.get<Salida[]>(jsonFile).subscribe((data: Salida[]) => {
      this.datos = this.procesarDatos(data);
      console.log(this.datos);
    });
  }

  procesarDatos(datos: Salida[]): Salida[] {
    return datos.map((item) => ({
      ...item,
      origen: JSON.parse(item.origen as unknown as string) as Origen[],
      destino: JSON.parse(item.destino as unknown as string) as Destino[]
    }));
  }

  
}

