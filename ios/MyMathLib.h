#import "MyMathLib.h"
#import <React/RCTBridgeModule.h>
#import <React/RCTLog.h>

@implementation MyMathLib

RCT_EXPORT_MODULE();

RCT_EXPORT_METHOD(divide:(double)a 
                        b:(double)b
                        resolver:(RCTPromiseResolveBlock)resolve
                        rejecter:(RCTPromiseRejectBlock)reject) {
    if (b == 0) {
        reject(@"DIVISION_BY_ZERO", @"Division by zero is not allowed", nil);
    } else {
        NSNumber *result = @(a / b);
        resolve(result);
    }
}

@end
