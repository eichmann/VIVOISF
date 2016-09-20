package edu.uiowa.slis.VIVOISF.ResearchOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchOrganizationIssuerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchOrganizationIssuerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchOrganizationIssuerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchOrganizationIssuerInverseIterator theResearchOrganizationIssuerInverseIterator = (ResearchOrganizationIssuerInverseIterator)findAncestorWithClass(this, ResearchOrganizationIssuerInverseIterator.class);
			pageContext.getOut().print(theResearchOrganizationIssuerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchOrganization for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchOrganization for issuer tag ");
		}
		return SKIP_BODY;
	}
}

