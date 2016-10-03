package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardUri currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StandardUriIterator theStandard = (StandardUriIterator)findAncestorWithClass(this, StandardUriIterator.class);
			pageContext.getOut().print(theStandard.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for uri tag ");
		}
		return SKIP_BODY;
	}
}

