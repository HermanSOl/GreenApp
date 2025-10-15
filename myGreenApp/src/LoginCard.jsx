import LoginForm from "./LoginForm";

function LoginCard({title}){

    return(
        <div class="login-container">
            <h1>{title}</h1>
            <LoginForm inputText = "Enter Nickname:" />
            <LoginForm inputText = "Enter Password:"/>
            <button>Submit</button>
            <a href="#">Don't have an account?</a>
        </div>

        
    );
}


export default LoginCard