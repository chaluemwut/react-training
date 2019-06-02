import React, {Component} from 'react';

class Login extends Component {

    state = {txt: 'Hello world'}

    onClickButton(){
        this.setState({
            txt: 'click me...'
        })
    }

    render(){
        return (
            <div>
                {this.state.txt}
                <button onClick={this.onClickButton.bind(this)}>click</button>                                
            </div>
        );
    }
}

export default Login;