#import "MyMathLib.h"

@implementation MyMathLib
RCT_EXPORT_MODULE()

- (NSNumber *)multiply:(double)a b:(double)b {
    NSNumber *result = @(a * b);
    return result;
}

- (NSNumber *)add:(double)a b:(double)b {
    NSNumber *result = @(a + b);
    return result;
}

- (NSNumber *)subtract:(double)a b:(double)b {
    NSNumber *result = @(a - b);
    return result;
}

- (NSNumber *)divide:(double)a b:(double)b {
    if (a == 0 || b == 0) {
        return @(0); 
    }
    NSNumber *result = @(a / b); 
    return result; 
}



- (std::shared_ptr<facebook::react::TurboModule>)getTurboModule:
    (const facebook::react::ObjCTurboModule::InitParams &)params {
    return std::make_shared<facebook::react::NativeMyMathLibSpecJSI>(params);
}

@end
