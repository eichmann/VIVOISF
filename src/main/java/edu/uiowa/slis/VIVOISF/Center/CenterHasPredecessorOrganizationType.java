package edu.uiowa.slis.VIVOISF.Center;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CenterHasPredecessorOrganizationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CenterHasPredecessorOrganizationType currentInstance = null;
	private static final Log log = LogFactory.getLog(CenterHasPredecessorOrganizationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CenterHasPredecessorOrganizationIterator theCenterHasPredecessorOrganizationIterator = (CenterHasPredecessorOrganizationIterator)findAncestorWithClass(this, CenterHasPredecessorOrganizationIterator.class);
			pageContext.getOut().print(theCenterHasPredecessorOrganizationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Center for hasPredecessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Center for hasPredecessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

