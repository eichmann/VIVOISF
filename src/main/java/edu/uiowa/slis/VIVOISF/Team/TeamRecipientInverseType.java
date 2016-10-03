package edu.uiowa.slis.VIVOISF.Team;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TeamRecipientInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TeamRecipientInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(TeamRecipientInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TeamRecipientInverseIterator theTeamRecipientInverseIterator = (TeamRecipientInverseIterator)findAncestorWithClass(this, TeamRecipientInverseIterator.class);
			pageContext.getOut().print(theTeamRecipientInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Team for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing Team for recipient tag ");
		}
		return SKIP_BODY;
	}
}

