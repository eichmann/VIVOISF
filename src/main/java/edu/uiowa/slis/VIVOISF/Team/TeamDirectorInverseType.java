package edu.uiowa.slis.VIVOISF.Team;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TeamDirectorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TeamDirectorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(TeamDirectorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TeamDirectorInverseIterator theTeamDirectorInverseIterator = (TeamDirectorInverseIterator)findAncestorWithClass(this, TeamDirectorInverseIterator.class);
			pageContext.getOut().print(theTeamDirectorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Team for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing Team for director tag ");
		}
		return SKIP_BODY;
	}
}

