package edu.uiowa.slis.VIVOISF.organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class organizationNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static organizationNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(organizationNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			organizationNameOfficialESIterator theorganization = (organizationNameOfficialESIterator)findAncestorWithClass(this, organizationNameOfficialESIterator.class);
			pageContext.getOut().print(theorganization.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing organization for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing organization for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

