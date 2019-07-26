import { AppRoutingModule } from './app-routing.module';

describe('AppRoutingModule', () => {
  let appRoutingModule: AppRoutingModule;

  beforeEach(() => {
    appRoutingModule = new AppRoutingModule();
  });
//test
  it('should create an instance', () => {
    expect(appRoutingModule).toBeTruthy();
  });
});
