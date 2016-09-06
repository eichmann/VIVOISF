package edu.uiowa.slis.VIVOISF.organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class organizationNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static organizationNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(organizationNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			organizationNameOfficialITIterator theorganization = (organizationNameOfficialITIterator)findAncestorWithClass(this, organizationNameOfficialITIterator.class);
			pageContext.getOut().print(theorganization.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing organization for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing organization for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

