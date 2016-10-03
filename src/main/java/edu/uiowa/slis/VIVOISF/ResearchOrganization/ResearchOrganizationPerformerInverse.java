package edu.uiowa.slis.VIVOISF.ResearchOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchOrganizationPerformerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchOrganizationPerformerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchOrganizationPerformerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchOrganizationPerformerInverseIterator theResearchOrganizationPerformerInverseIterator = (ResearchOrganizationPerformerInverseIterator)findAncestorWithClass(this, ResearchOrganizationPerformerInverseIterator.class);
			pageContext.getOut().print(theResearchOrganizationPerformerInverseIterator.getPerformerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchOrganization for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchOrganization for performer tag ");
		}
		return SKIP_BODY;
	}
}

