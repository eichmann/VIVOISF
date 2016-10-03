package edu.uiowa.slis.VIVOISF.Team;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TeamPrefixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TeamPrefixName currentInstance = null;
	private static final Log log = LogFactory.getLog(TeamPrefixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TeamPrefixNameIterator theTeam = (TeamPrefixNameIterator)findAncestorWithClass(this, TeamPrefixNameIterator.class);
			pageContext.getOut().print(theTeam.getPrefixName());
		} catch (Exception e) {
			log.error("Can't find enclosing Team for prefixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Team for prefixName tag ");
		}
		return SKIP_BODY;
	}
}

