import React from 'react';
import { Switch, Route, BrowserRouter as Router } from 'react-router-dom';
import Navbar from '../components/Nav';
import main from '../layout/main';

export default function() {
  return (
    <Router>
      <Switch>
        <Route exact path="/" component={main} />
        <Route path="/asd" component={Navbar} />
      </Switch>
    </Router>
  );
}
