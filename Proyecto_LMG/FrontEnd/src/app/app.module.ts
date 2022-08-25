import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './componentes/header/header.component';
import { APlogoComponent } from './componentes/aplogo/aplogo.component';
import { RSocialComponent } from './componentes/rsocial/rsocial.component';
import { BannnerComponent } from './componentes/bannner/bannner.component';
import { AcercaDeComponent } from './componentes/acerca-de/acerca-de.component';
import { ExperienciaComponent } from './componentes/experiencia/experiencia.component';
import { EducacionComponent } from './componentes/educacion/educacion.component';
// Import ng-circle-progress
import { NgCircleProgressModule } from 'ng-circle-progress';
import { HySComponent } from './componentes/hy-s/hy-s.component';
import { ProyectoComponent } from './componentes/proyecto/proyecto.component';
import { FooterComponent } from './componentes/footer/footer.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    APlogoComponent,
    RSocialComponent,
    BannnerComponent,
    AcercaDeComponent,
    ExperienciaComponent,
    EducacionComponent,
    HySComponent,
    ProyectoComponent,
    FooterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgCircleProgressModule.forRoot({})
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
