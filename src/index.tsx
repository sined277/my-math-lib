import MyMathLib from './NativeMyMathLib';

export function multiply(a: number, b: number): number {
  return MyMathLib.multiply(a, b);
}

export function add(a: number, b: number): number {
  return MyMathLib.add(a, b);
}

export function divide(a: number, b: number): number | string {
  const response = MyMathLib.divide(a, b);

  if (response?.error) {
    return response.error;
  }

  if (response?.result !== undefined) {
    return response.result as number;
  }

  throw new Error('Unexpected response from MyMathLib.divide');
}

export function subtract(a: number, b: number): number {
  return MyMathLib.subtract(a, b);
}
