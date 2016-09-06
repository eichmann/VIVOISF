package edu.uiowa.slis.VIVOISF.organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class organizationNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static organizationNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(organizationNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			organizationNameShortESIterator theorganization = (organizationNameShortESIterator)findAncestorWithClass(this, organizationNameShortESIterator.class);
			pageContext.getOut().print(theorganization.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing organization for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing organization for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

