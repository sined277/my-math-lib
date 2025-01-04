import { NativeModules } from 'react-native';

const { MyMathLib } = NativeModules;

export const add = (a: number, b: number): Promise<number> =>
  new Promise((resolve) => {
    MyMathLib.add(a, b, (result: number) => resolve(result));
  });

export const subtract = (a: number, b: number): Promise<number> =>
  new Promise((resolve) => {
    MyMathLib.subtract(a, b, (result: number) => resolve(result));
  });

export const multiply = (a: number, b: number): Promise<number> =>
  new Promise((resolve) => {
    MyMathLib.multiply(a, b, (result: number) => resolve(result));
  });

export const divide = (a: number, b: number): Promise<number | string> =>
  new Promise((resolve, reject) => {
    if (b === 0) {
      reject('Cannot divide by zero');
    } else {
      MyMathLib.divide(a, b, (result: number | string) => {
        if (typeof result === 'string') {
          reject(result);
        } else {
          resolve(result);
        }
      });
    }
  });
