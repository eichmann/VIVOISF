package edu.uiowa.slis.VIVOISF.ResearchOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchOrganizationCourtInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchOrganizationCourtInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchOrganizationCourtInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchOrganizationCourtInverseIterator theResearchOrganizationCourtInverseIterator = (ResearchOrganizationCourtInverseIterator)findAncestorWithClass(this, ResearchOrganizationCourtInverseIterator.class);
			pageContext.getOut().print(theResearchOrganizationCourtInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchOrganization for court tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchOrganization for court tag ");
		}
		return SKIP_BODY;
	}
}

