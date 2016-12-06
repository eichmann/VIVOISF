package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationCodeAGROVOCIterator theOrganization = (OrganizationCodeAGROVOCIterator)findAncestorWithClass(this, OrganizationCodeAGROVOCIterator.class);
			pageContext.getOut().print(theOrganization.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

