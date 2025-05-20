import { Routes } from '@angular/router';
import { ProductListComponent } from './components/product-list/product-list.component';
import { ProductFormComponent } from './components/product-form/product-form.component';

export const routes: Routes = [
  {
    path: 'productos',
    component: ProductListComponent,
    title: 'Lista de Productos'
  },
  {
    path: 'agregar',
    component: ProductFormComponent,
    title: 'Agregar Producto'
  },
  { path: '', redirectTo: '/productos', pathMatch: 'full' },
  { path: '**', redirectTo: '/productos' }
];
