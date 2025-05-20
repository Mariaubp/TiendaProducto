import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({ providedIn: 'root' })
export class ProductService {
  private apiUrl = 'http://localhost:8080/api/productos';

  constructor(private http: HttpClient) { }

  getProducts(name?: string, vigente?: boolean): Observable<any[]> {
    return this.http.get<any[]>(this.apiUrl, {
      params: {
        nombre: name || '',
        vigente: vigente !== undefined ? vigente.toString() : ''
      }
    });
  }

  deleteProduct(id: number): Observable<void> {
    return this.http.delete<void>(`${this.apiUrl}/${id}`);
  }
}
