package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleDateTimeValue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleDateTimeValue currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleDateTimeValue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleDateTimeValueIterator theResearcherRoleDateTimeValueIterator = (ResearcherRoleDateTimeValueIterator)findAncestorWithClass(this, ResearcherRoleDateTimeValueIterator.class);
			pageContext.getOut().print(theResearcherRoleDateTimeValueIterator.getDateTimeValue());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

