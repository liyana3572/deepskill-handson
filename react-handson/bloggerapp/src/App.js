import './App.css';
   import { books } from './books';

   const courses = [
     { id: 1, title: 'Angular', date: '4/5/2021' },
     { id: 2, title: 'React', date: '6/3/2021' }
   ];

   const blogs = [
     { id: 1, title: 'React Learning', author: 'Stephen Biz', body: 'Welcome to learning React!' },
     { id: 2, title: 'Installation', author: 'Schwarzenegger', body: 'You can install React from npm.' }
   ];

   function App() {
     // 1. Ternary operator
     const coursedet = courses.length > 0 ? (
       <div>
         {courses.map((course) => (
           <div key={course.id}>
             <h2>{course.title}</h2>
             <p>{course.date}</p>
           </div>
         ))}
       </div>
     ) : (
       <p>No courses available</p>
     );

     // 2. Element variable
     const bookdet = (
       <div>
         {books.map((book) => (
           <div key={book.id}>
             <h3>{book.bname}</h3>
             <h4>{book.price}</h4>
           </div>
         ))}
       </div>
     );

     // 3. && operator
     const content = blogs.length > 0 && (
       <div>
         {blogs.map((blog) => (
           <div key={blog.id}>
             <h2>{blog.title}</h2>
             <h4>{blog.author}</h4>
             <p>{blog.body}</p>
           </div>
         ))}
       </div>
     );

     return (
       <div className="container">
         <div className="mystyle1">
           <h1>Course Details</h1>
           {coursedet}
         </div>
         <div className="st2">
           <h1>Book Details</h1>
           {bookdet}
         </div>
         <div className="v1">
           <h1>Blog Details</h1>
           {content}
         </div>
       </div>
     );
   }

   export default App;