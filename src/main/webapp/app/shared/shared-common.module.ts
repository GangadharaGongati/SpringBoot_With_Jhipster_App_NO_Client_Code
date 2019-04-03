import { NgModule } from '@angular/core';

import { SpringBootWithJhipsterAppSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
    imports: [SpringBootWithJhipsterAppSharedLibsModule],
    declarations: [JhiAlertComponent, JhiAlertErrorComponent],
    exports: [SpringBootWithJhipsterAppSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class SpringBootWithJhipsterAppSharedCommonModule {}
