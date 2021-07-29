import React from 'react';
import ReactDOM from 'react-dom';
import'./index.css';
class Clock extends React.Component{
    render(){
        return(
        <div>
          <h1>HELLO WORLD!!!</h1>
        <h2>IT IS {this.props.date.toLocaleTimeString()}.</h2>  
        </div>
        );
    }
}

function tick() {
    ReactDOM.render(
      <Clock date={new Date()} />,
      document.getElementById('root')
    );
  }
  
  setInterval(tick, 1000);
 export default Clock;