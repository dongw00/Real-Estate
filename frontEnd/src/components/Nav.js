import React from 'react';
import Navbar from 'react-bootstrap/Navbar';
import logo from '../assets/image/logo/logo.png';

export default class Nav extends React.Component {
  render() {
    return (
      <Navbar className="navbar-toggle" bg="dark" variant="dark">
        <Navbar.Brand href="#home">
          <img id="logo" src={logo} alt="logo" />
          {'Booking'}
        </Navbar.Brand>
      </Navbar>
    );
  }
}
