package edu.uiowa.slis.VIVOISF.organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class organizationNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static organizationNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(organizationNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			organizationNameShortITIterator theorganization = (organizationNameShortITIterator)findAncestorWithClass(this, organizationNameShortITIterator.class);
			pageContext.getOut().print(theorganization.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing organization for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing organization for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

