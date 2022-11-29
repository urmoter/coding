const date = new Date();
const user = process.env.USER || '';

console.log(`Hello ${user} today is ${date}!`);
