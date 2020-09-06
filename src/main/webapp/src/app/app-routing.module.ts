import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AccountComponent } from './account/account.component';
import { CatalogComponent } from './catalog/catalog.component';
import { BorrowComponent } from './borrow/borrow.component';

const routes: Routes = [
  { path: '', redirectTo: 'katalog', pathMatch: 'full' },
  { path: 'konto', component: AccountComponent }, // "account"
  { path: 'katalog', component: CatalogComponent }, // "catalog"
  { path: 'wypozycz', component: BorrowComponent }, // "borrow"
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
