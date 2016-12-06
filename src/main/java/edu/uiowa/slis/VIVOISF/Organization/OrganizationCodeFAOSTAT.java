package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationCodeFAOSTATIterator theOrganization = (OrganizationCodeFAOSTATIterator)findAncestorWithClass(this, OrganizationCodeFAOSTATIterator.class);
			pageContext.getOut().print(theOrganization.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}

