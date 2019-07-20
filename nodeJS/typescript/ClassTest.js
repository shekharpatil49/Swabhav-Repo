var Customer = /** @class */ (function () {
    function Customer(id, firstName, lastName) {
        this._id = id;
        this._firstName = firstName;
        this._lastName = lastName;
    }
    Object.defineProperty(Customer.prototype, "FirstName", {
        get: function () {
            return this._firstName;
        },
        set: function (fname) {
            this._firstName = fname;
        },
        enumerable: true,
        configurable: true
    });
    return Customer;
}());
var c1 = new Customer(101, "Shekhar", "Patil");
console.log(c1.FirstName);
c1.FirstName = "Ram";
console.log(c1.FirstName);
