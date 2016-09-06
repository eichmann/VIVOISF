package edu.uiowa.slis.VIVOISF.Center;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CenterHasSuccessorOrganization extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CenterHasSuccessorOrganization currentInstance = null;
	private static final Log log = LogFactory.getLog(CenterHasSuccessorOrganization.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CenterHasSuccessorOrganizationIterator theCenterHasSuccessorOrganizationIterator = (CenterHasSuccessorOrganizationIterator)findAncestorWithClass(this, CenterHasSuccessorOrganizationIterator.class);
			pageContext.getOut().print(theCenterHasSuccessorOrganizationIterator.getHasSuccessorOrganization());
		} catch (Exception e) {
			log.error("Can't find enclosing Center for hasSuccessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Center for hasSuccessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

