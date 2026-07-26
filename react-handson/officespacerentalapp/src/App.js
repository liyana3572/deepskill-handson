import './App.css';
   import officeImg from './office.jpg'; 
   const element = 'Office Space';
   const jsxatt = <img src={officeImg} width="25%" height="25%" alt="Office Space" />;

   const officeList = [
     { Name: 'DBS', Rent: 50000, Address: 'Chennai' },
     { Name: 'TCS', Rent: 75000, Address: 'Bangalore' },
     { Name: 'Infosys', Rent: 55000, Address: 'Hyderabad' }
   ];

   function getColorClass(rent) {
     let colors = [];
     if (rent <= 60000) {
       colors.push('textRed');
     } else {
       colors.push('textGreen');
     }
     return colors.join(' ');
   }

   function App() {
     return (
       <div>
         <h1>{element}, at Affordable Range</h1>
         {jsxatt}
         {officeList.map((item, index) => (
           <div key={index}>
             <h1>Name: {item.Name}</h1>
             <h3 className={getColorClass(item.Rent)}>Rent: Rs. {item.Rent}</h3>
             <h3>Address: {item.Address}</h3>
           </div>
         ))}
       </div>
     );
   }

   export default App;