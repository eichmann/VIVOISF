package edu.uiowa.slis.VIVOISF.organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class organizationNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static organizationNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(organizationNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			organizationNameOfficialZHIterator theorganization = (organizationNameOfficialZHIterator)findAncestorWithClass(this, organizationNameOfficialZHIterator.class);
			pageContext.getOut().print(theorganization.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing organization for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing organization for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

