import React from 'react';
import { library } from '@fortawesome/fontawesome-svg-core';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faEnvelope } from '@fortawesome/free-solid-svg-icons';

library.add(faEnvelope);

export default class footer extends React.Component {
  render() {
    return (
      <div className="footer">
        <span className="footer_yellow">2019년 1학기 종합설계</span> 작품입니다.
        해당 페이지는 서동우(한국항공대), 최진현(한국항공대),
        박진우(한국항공대)가 제작했습니다.
        <div>Copyright(c) 2019 All rights reserved dongw00</div>
        <div>
          <FontAwesomeIcon icon="envelope" />
          albadw0428@gmail.com
        </div>
      </div>
    );
  }
}
