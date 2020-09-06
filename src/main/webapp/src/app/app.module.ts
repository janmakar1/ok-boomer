import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AccountComponent } from './account/account.component';
import { CatalogComponent } from './catalog/catalog.component';
import { BorrowComponent } from './borrow/borrow.component';

@NgModule({
  declarations: [
    AppComponent,
    AccountComponent,
    CatalogComponent,
    BorrowComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
