package edu.uiowa.slis.VIVOISF.URL;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class URLRelates extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static URLRelates currentInstance = null;
	private static final Log log = LogFactory.getLog(URLRelates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			URLRelatesIterator theURLRelatesIterator = (URLRelatesIterator)findAncestorWithClass(this, URLRelatesIterator.class);
			pageContext.getOut().print(theURLRelatesIterator.getRelates());
		} catch (Exception e) {
			log.error("Can't find enclosing URL for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing URL for relates tag ");
		}
		return SKIP_BODY;
	}
}

