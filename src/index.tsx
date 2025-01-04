import MyMathLib from './NativeMyMathLib';

export function multiply(a: number, b: number): number {
  return MyMathLib.multiply(a, b);
}

export function add(a: number, b: number): number {
  return MyMathLib.add(a, b);
}

export function divide(a: number, b: number): number | string {
  return MyMathLib.divide(a, b);
}

export function subtract(a: number, b: number): number {
  return MyMathLib.subtract(a, b);
}
