import LoginForm from "./LoginForm";

function LoginCard(){

    return(
        <div class="login-container">
            <h1>Login</h1>
            <LoginForm inputText = "Enter Nickname:" />
            <LoginForm inputText = "Enter Password :"/>
            <a href="#">Don't have an account? </a>
        </div>

        
    );
}


export default LoginCard