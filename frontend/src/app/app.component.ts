import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, RouterLink, RouterLinkActive } from '@angular/router';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [
    CommonModule,
    RouterModule,
    RouterLink,
    RouterLinkActive
  ],
  template: `
    <div class="app-container">
      <header class="app-header">
        <h1>🛍️ Tienda de Productos</h1>
        <nav>
          <a routerLink="/productos" routerLinkActive="active">Productos</a>
          <a routerLink="/agregar" routerLinkActive="active">➕ Nuevo</a>
        </nav>
      </header>

      <main>
        <router-outlet></router-outlet>
      </main>

    </div>
  `,
  styles: [`
    /* Tus estilos aquí */
    .active {
      font-weight: bold;
      border-bottom: 2px solid #3498db;
    }
  `]
})
export class AppComponent {}
