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

- (id)divide:(double)a b:(double)b {
    if (a == 0) return 0
    else if (b == 0) return @"Division by zero is not allowed";
    NSNumber *result = @(a / b);
    return result
}


- (std::shared_ptr<facebook::react::TurboModule>)getTurboModule:
    (const facebook::react::ObjCTurboModule::InitParams &)params {
    return std::make_shared<facebook::react::NativeMyMathLibSpecJSI>(params);
}

@end
