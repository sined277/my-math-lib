@objc(MyMathLib)
class MyMathLib: NSObject {

  @objc func add(_ a: Double, b: Double, callback: @escaping RCTResponseSenderBlock) {
    let result = a + b
    callback([result])
  }

  @objc func subtract(_ a: Double, b: Double, callback: @escaping RCTResponseSenderBlock) {
    let result = a - b
    callback([result])
  }

  @objc func multiply(_ a: Double, b: Double, callback: @escaping RCTResponseSenderBlock) {
    let result = a * b
    callback([result])
  }

  @objc func divide(_ a: Double, b: Double, callback: @escaping RCTResponseSenderBlock) {
    if b == 0 {
      callback([NSNull(), "Division by zero is not allowed"]) 
    } else {
      let result = a / b
      callback([result])
    }
  }
}
