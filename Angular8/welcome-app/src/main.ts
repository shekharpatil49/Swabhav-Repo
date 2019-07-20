import { enableProdMode } from '@angular/core';
import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';

import { AppModule } from './app/app.module';
import { environment } from './environments/environment';
import { WelcomeModule } from './app/welcome/welcome.module';

if (environment.production) {
  enableProdMode();
}

platformBrowserDynamic().bootstrapModule(WelcomeModule)
  .catch(err => console.error(err));
