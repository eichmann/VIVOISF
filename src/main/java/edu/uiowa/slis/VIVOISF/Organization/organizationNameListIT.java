package edu.uiowa.slis.VIVOISF.organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class organizationNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static organizationNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(organizationNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			organizationNameListITIterator theorganization = (organizationNameListITIterator)findAncestorWithClass(this, organizationNameListITIterator.class);
			pageContext.getOut().print(theorganization.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing organization for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing organization for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

