package edu.uiowa.slis.VIVOISF.ResearchOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchOrganizationDirectorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchOrganizationDirectorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchOrganizationDirectorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchOrganizationDirectorInverseIterator theResearchOrganizationDirectorInverseIterator = (ResearchOrganizationDirectorInverseIterator)findAncestorWithClass(this, ResearchOrganizationDirectorInverseIterator.class);
			pageContext.getOut().print(theResearchOrganizationDirectorInverseIterator.getDirectorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchOrganization for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchOrganization for director tag ");
		}
		return SKIP_BODY;
	}
}

