package edu.uiowa.slis.VIVOISF.ResearchOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchOrganizationOBI_0000304Inverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchOrganizationOBI_0000304Inverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchOrganizationOBI_0000304Inverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchOrganizationOBI_0000304InverseIterator theResearchOrganizationOBI_0000304InverseIterator = (ResearchOrganizationOBI_0000304InverseIterator)findAncestorWithClass(this, ResearchOrganizationOBI_0000304InverseIterator.class);
			pageContext.getOut().print(theResearchOrganizationOBI_0000304InverseIterator.getOBI_0000304Inverse());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchOrganization for OBI_0000304 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchOrganization for OBI_0000304 tag ");
		}
		return SKIP_BODY;
	}
}

