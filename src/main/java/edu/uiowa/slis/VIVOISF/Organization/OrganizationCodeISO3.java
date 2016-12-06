package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationCodeISO3Iterator theOrganization = (OrganizationCodeISO3Iterator)findAncestorWithClass(this, OrganizationCodeISO3Iterator.class);
			pageContext.getOut().print(theOrganization.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}

