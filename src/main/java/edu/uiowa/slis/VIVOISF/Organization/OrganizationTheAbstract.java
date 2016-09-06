package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationTheAbstractIterator theOrganization = (OrganizationTheAbstractIterator)findAncestorWithClass(this, OrganizationTheAbstractIterator.class);
			pageContext.getOut().print(theOrganization.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

