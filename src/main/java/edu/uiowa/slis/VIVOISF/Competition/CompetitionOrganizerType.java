package edu.uiowa.slis.VIVOISF.Competition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompetitionOrganizerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompetitionOrganizerType currentInstance = null;
	private static final Log log = LogFactory.getLog(CompetitionOrganizerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompetitionOrganizerIterator theCompetitionOrganizerIterator = (CompetitionOrganizerIterator)findAncestorWithClass(this, CompetitionOrganizerIterator.class);
			pageContext.getOut().print(theCompetitionOrganizerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Competition for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Competition for organizer tag ");
		}
		return SKIP_BODY;
	}
}

