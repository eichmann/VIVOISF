package edu.uiowa.slis.VIVOISF.Team;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TeamSuffixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TeamSuffixName currentInstance = null;
	private static final Log log = LogFactory.getLog(TeamSuffixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TeamSuffixNameIterator theTeam = (TeamSuffixNameIterator)findAncestorWithClass(this, TeamSuffixNameIterator.class);
			pageContext.getOut().print(theTeam.getSuffixName());
		} catch (Exception e) {
			log.error("Can't find enclosing Team for suffixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Team for suffixName tag ");
		}
		return SKIP_BODY;
	}
}

