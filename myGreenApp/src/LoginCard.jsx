import LoginForm from "./LoginForm";
import { Link } from "react-router-dom";

function LoginCard({title}){

    return(
        <div class="login-container">
            <h1>{title}</h1>
            <LoginForm inputText = "Enter Nickname:"/>
            <LoginForm inputText = "Enter Password:"/>
            <button>Submit</button>
            <Link to = "/create-account">Don't have an account?</Link>
        </div>

        
    );
}


export default LoginCard