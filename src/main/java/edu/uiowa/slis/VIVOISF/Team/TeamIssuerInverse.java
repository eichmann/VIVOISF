package edu.uiowa.slis.VIVOISF.Team;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TeamIssuerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TeamIssuerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(TeamIssuerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TeamIssuerInverseIterator theTeamIssuerInverseIterator = (TeamIssuerInverseIterator)findAncestorWithClass(this, TeamIssuerInverseIterator.class);
			pageContext.getOut().print(theTeamIssuerInverseIterator.getIssuerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Team for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Team for issuer tag ");
		}
		return SKIP_BODY;
	}
}

