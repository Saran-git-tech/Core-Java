
//add without push
let arr = [1, 2, 3, 4];
let newElement = 5;


arr[arr.length] = newElement;

console.log("After adding element:", arr); 

//remove without pop

let nums = [1, 2, 3, 4, 5];


nums.length = nums.length - 1;

console.log("After removing last element:", nums); 

//insert special char

let normalArray = [1, 2, 3, 4];

let specialChar = '*';

let joinedString = normalArray.join(specialChar);


console.log("Array with special characters:", joinedString);

//ArrayOfObjects


let employees = [
    {
        empid: 1,
        empname: 'Saran',
        empsalary: 50000,
        empdesignation: 'developer'
    },
    {
        empid: 2,
        empname: 'Tamil',
        empsalary: 60000,
        empdesignation: 'manager'
    },
    {
        empid: 3,
        empname: 'Jessie',
        empsalary: 55000,
        empdesignation: 'designer'
    },
    {
        empid: 4,
        empname: 'sara',
        empsalary: 65000,
        empdesignation: 'tester'
    }
];

for (let i = 0; i < 3; i++) {
    console.log(employees[i]);
}

