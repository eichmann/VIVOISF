package edu.uiowa.slis.VIVOISF.ResearchOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchOrganizationCourtInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchOrganizationCourtInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchOrganizationCourtInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchOrganizationCourtInverseIterator theResearchOrganizationCourtInverseIterator = (ResearchOrganizationCourtInverseIterator)findAncestorWithClass(this, ResearchOrganizationCourtInverseIterator.class);
			pageContext.getOut().print(theResearchOrganizationCourtInverseIterator.getCourtInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchOrganization for court tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchOrganization for court tag ");
		}
		return SKIP_BODY;
	}
}

