package edu.uiowa.slis.VIVOISF.Foundation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FoundationGoverningAuthorityFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FoundationGoverningAuthorityFor currentInstance = null;
	private static final Log log = LogFactory.getLog(FoundationGoverningAuthorityFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FoundationGoverningAuthorityForIterator theFoundationGoverningAuthorityForIterator = (FoundationGoverningAuthorityForIterator)findAncestorWithClass(this, FoundationGoverningAuthorityForIterator.class);
			pageContext.getOut().print(theFoundationGoverningAuthorityForIterator.getGoverningAuthorityFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Foundation for governingAuthorityFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Foundation for governingAuthorityFor tag ");
		}
		return SKIP_BODY;
	}
}

