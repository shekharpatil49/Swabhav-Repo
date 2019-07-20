"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Student = /** @class */ (function () {
    function Student(roll_no, firstName, lastName) {
        this.roll_no = roll_no;
        this.firstName = firstName;
        this.lastName = lastName;
        this.roll_no = roll_no;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    Object.defineProperty(Student.prototype, "RollNo", {
        get: function () {
            return this.roll_no;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Student.prototype, "FirstName", {
        get: function () {
            return this.firstName;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Student.prototype, "LastName", {
        get: function () {
            return this.lastName;
        },
        enumerable: true,
        configurable: true
    });
    return Student;
}());
exports.Student = Student;
var Address = /** @class */ (function () {
    function Address(street) {
        this.street = street;
        this.street = street;
    }
    Object.defineProperty(Address.prototype, "Street", {
        get: function () {
            return this.street;
        },
        enumerable: true,
        configurable: true
    });
    return Address;
}());
exports.Address = Address;
