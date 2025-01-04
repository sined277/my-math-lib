import type { TurboModule } from 'react-native';
import { TurboModuleRegistry } from 'react-native';

export interface Spec extends TurboModule {
  multiply(a: number, b: number): number;
  add(a: number, b: number): number;
  subtract(a: number, b: number): number;
  divide(a: number, b: number): { result?: number; error?: string };
}

export default TurboModuleRegistry.getEnforcing<Spec>('MyMathLib');
