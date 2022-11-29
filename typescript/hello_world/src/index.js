const date = new Date();
const user = process.env.USER || '';
console.log('Hello '.concat(user, ' today is ').concat(date, '!'));
