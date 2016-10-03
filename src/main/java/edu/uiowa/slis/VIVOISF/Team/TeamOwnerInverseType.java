package edu.uiowa.slis.VIVOISF.Team;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TeamOwnerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TeamOwnerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(TeamOwnerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TeamOwnerInverseIterator theTeamOwnerInverseIterator = (TeamOwnerInverseIterator)findAncestorWithClass(this, TeamOwnerInverseIterator.class);
			pageContext.getOut().print(theTeamOwnerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Team for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Team for owner tag ");
		}
		return SKIP_BODY;
	}
}

