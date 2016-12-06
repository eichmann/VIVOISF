package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationCodeUNDPIterator theOrganization = (OrganizationCodeUNDPIterator)findAncestorWithClass(this, OrganizationCodeUNDPIterator.class);
			pageContext.getOut().print(theOrganization.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}

