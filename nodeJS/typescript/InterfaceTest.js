function printStudent(student) {
    for (let s of student) {
        console.log(s.id);
    }
}
printStudent([{ id: "101", firstName: "pqr", lastName: "xyz"
    }, { id: "102", firstName: "abc", lastName: "rsq"
    }]);
