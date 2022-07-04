var input = require("fs").readFileSync("JS/stdin", "utf8");
var lines = input.split("\n");

let raio = Number(lines[0])
let pi = 3.14159

let area = pi * (Math.pow(raio, 2));

console.log("A=" + area.toFixed(4));