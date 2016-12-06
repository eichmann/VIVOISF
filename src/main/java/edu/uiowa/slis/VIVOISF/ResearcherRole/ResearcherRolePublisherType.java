package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRolePublisherType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRolePublisherType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRolePublisherType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearcherRolePublisherIterator theResearcherRolePublisherIterator = (ResearcherRolePublisherIterator)findAncestorWithClass(this, ResearcherRolePublisherIterator.class);
			pageContext.getOut().print(theResearcherRolePublisherIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for publisher tag ");
		}
		return SKIP_BODY;
	}
}

