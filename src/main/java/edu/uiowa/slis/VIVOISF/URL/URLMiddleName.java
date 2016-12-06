package edu.uiowa.slis.VIVOISF.URL;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class URLMiddleName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static URLMiddleName currentInstance = null;
	private static final Log log = LogFactory.getLog(URLMiddleName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			URLMiddleNameIterator theURL = (URLMiddleNameIterator)findAncestorWithClass(this, URLMiddleNameIterator.class);
			pageContext.getOut().print(theURL.getMiddleName());
		} catch (Exception e) {
			log.error("Can't find enclosing URL for middleName tag ", e);
			throw new JspTagException("Error: Can't find enclosing URL for middleName tag ");
		}
		return SKIP_BODY;
	}
}

