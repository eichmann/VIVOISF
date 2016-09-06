package edu.uiowa.slis.VIVOISF.ResearchOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchOrganizationPublisherOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchOrganizationPublisherOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchOrganizationPublisherOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchOrganizationPublisherOfIterator theResearchOrganizationPublisherOfIterator = (ResearchOrganizationPublisherOfIterator)findAncestorWithClass(this, ResearchOrganizationPublisherOfIterator.class);
			pageContext.getOut().print(theResearchOrganizationPublisherOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchOrganization for publisherOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchOrganization for publisherOf tag ");
		}
		return SKIP_BODY;
	}
}

