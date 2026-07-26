import { useState } from 'react';

   function App() {
     const [count, setCount] = useState(0);
     const [amount, setAmount] = useState('');

     function sayHello() {
       alert('Hello! Member!');
     }

     function increment() {
       setCount(count + 1);
       sayHello(); // Increment button invokes two methods
     }

     function decrement() {
       setCount(count - 1);
     }

     function sayWelcome(message) {
       alert(message);
     }

     function handlePress(e) {
       alert('I was clicked'); // synthetic event, e is React's SyntheticEvent
     }

     function handleSubmit() {
       const euro = (amount * 0.011).toFixed(2);
       alert('Converting to Euro Amount is ' + euro);
     }

     return (
       <div>
         <h2>Counter: {count}</h2>
         <button onClick={increment}>Increment</button>
         <button onClick={decrement}>Decrement</button>
         <button onClick={() => sayWelcome('welcome')}>Say Welcome</button>
         <button onClick={handlePress}>Click on me</button>

         <h2>Currency Convertor!!!</h2>
         <input
           type="number"
           placeholder="Amount"
           value={amount}
           onChange={(e) => setAmount(e.target.value)}
         />
         <button onClick={handleSubmit}>Convert</button>
       </div>
     );
   }

   export default App;