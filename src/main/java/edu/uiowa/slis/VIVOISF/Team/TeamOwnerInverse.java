package edu.uiowa.slis.VIVOISF.Team;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TeamOwnerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TeamOwnerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(TeamOwnerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TeamOwnerInverseIterator theTeamOwnerInverseIterator = (TeamOwnerInverseIterator)findAncestorWithClass(this, TeamOwnerInverseIterator.class);
			pageContext.getOut().print(theTeamOwnerInverseIterator.getOwnerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Team for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Team for owner tag ");
		}
		return SKIP_BODY;
	}
}

