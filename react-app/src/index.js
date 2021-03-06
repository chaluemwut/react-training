import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import * as serviceWorker from './serviceWorker';

import Login from './Login';
import {BrowserRouter, Route} from 'react-router-dom';

function RouterApp(){
    return <BrowserRouter>
        <Route exact path="/" component={App}/>
        <Route path="/login" component={Login}/>
    </BrowserRouter>;
}
ReactDOM.render(<RouterApp />, document.getElementById('root'));

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();
