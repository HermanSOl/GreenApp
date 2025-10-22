import LoginForm from "./LoginForm";
import { Link } from "react-router-dom";

function CreateAccCard({title}) {
    return (
      <div className="login-container">
        <h1>{title}</h1>
        <LoginForm inputText="Enter Nickname:" />
        <LoginForm inputText="Enter Password:" />
        <LoginForm inputText="Confirm Password:" />
        <button>Create Account</button>
  
        <Link to="/">Already have an account?</Link>
      </div>
    );
  }
  
  export default CreateAccCard;