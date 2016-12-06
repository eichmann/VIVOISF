package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleDateTimeInterval extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleDateTimeInterval currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleDateTimeInterval.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleDateTimeIntervalIterator theResearcherRoleDateTimeIntervalIterator = (ResearcherRoleDateTimeIntervalIterator)findAncestorWithClass(this, ResearcherRoleDateTimeIntervalIterator.class);
			pageContext.getOut().print(theResearcherRoleDateTimeIntervalIterator.getDateTimeInterval());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

