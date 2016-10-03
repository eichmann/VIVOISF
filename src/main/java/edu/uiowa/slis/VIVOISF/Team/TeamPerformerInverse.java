package edu.uiowa.slis.VIVOISF.Team;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TeamPerformerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TeamPerformerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(TeamPerformerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TeamPerformerInverseIterator theTeamPerformerInverseIterator = (TeamPerformerInverseIterator)findAncestorWithClass(this, TeamPerformerInverseIterator.class);
			pageContext.getOut().print(theTeamPerformerInverseIterator.getPerformerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Team for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Team for performer tag ");
		}
		return SKIP_BODY;
	}
}

