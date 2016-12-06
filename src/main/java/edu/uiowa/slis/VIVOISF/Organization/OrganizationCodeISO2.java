package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationCodeISO2Iterator theOrganization = (OrganizationCodeISO2Iterator)findAncestorWithClass(this, OrganizationCodeISO2Iterator.class);
			pageContext.getOut().print(theOrganization.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

