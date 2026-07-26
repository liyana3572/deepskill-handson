export const IndianTeam = ['Sachin1', 'Dhoni2', 'Virat3', 'Rohit4', 'Yuvaraj5', 'Raina6'];

   export function OddPlayers([first, , third, , fifth]) {
     return (
       <ul>
         <li>First: {first}</li>
         <li>Third: {third}</li>
         <li>Fifth: {fifth}</li>
       </ul>
     );
   }

   export function EvenPlayers([, second, , fourth, , sixth]) {
     return (
       <ul>
         <li>Second: {second}</li>
         <li>Fourth: {fourth}</li>
         <li>Sixth: {sixth}</li>
       </ul>
     );
   }