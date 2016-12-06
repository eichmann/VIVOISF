package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleDateTimeValueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleDateTimeValueType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleDateTimeValueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleDateTimeValueIterator theResearcherRoleDateTimeValueIterator = (ResearcherRoleDateTimeValueIterator)findAncestorWithClass(this, ResearcherRoleDateTimeValueIterator.class);
			pageContext.getOut().print(theResearcherRoleDateTimeValueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

