package edu.uiowa.slis.VIVOISF.Foundation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FoundationGoverningAuthorityForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FoundationGoverningAuthorityForType currentInstance = null;
	private static final Log log = LogFactory.getLog(FoundationGoverningAuthorityForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FoundationGoverningAuthorityForIterator theFoundationGoverningAuthorityForIterator = (FoundationGoverningAuthorityForIterator)findAncestorWithClass(this, FoundationGoverningAuthorityForIterator.class);
			pageContext.getOut().print(theFoundationGoverningAuthorityForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Foundation for governingAuthorityFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Foundation for governingAuthorityFor tag ");
		}
		return SKIP_BODY;
	}
}

