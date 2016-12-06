package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationFreetextKeywordIterator theOrganization = (OrganizationFreetextKeywordIterator)findAncestorWithClass(this, OrganizationFreetextKeywordIterator.class);
			pageContext.getOut().print(theOrganization.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

