package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationCodeUNIterator theOrganization = (OrganizationCodeUNIterator)findAncestorWithClass(this, OrganizationCodeUNIterator.class);
			pageContext.getOut().print(theOrganization.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

