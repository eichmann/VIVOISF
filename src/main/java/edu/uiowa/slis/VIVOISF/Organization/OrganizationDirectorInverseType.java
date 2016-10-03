package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationDirectorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationDirectorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationDirectorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationDirectorInverseIterator theOrganizationDirectorInverseIterator = (OrganizationDirectorInverseIterator)findAncestorWithClass(this, OrganizationDirectorInverseIterator.class);
			pageContext.getOut().print(theOrganizationDirectorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for director tag ");
		}
		return SKIP_BODY;
	}
}

