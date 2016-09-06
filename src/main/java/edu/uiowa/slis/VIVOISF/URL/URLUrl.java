package edu.uiowa.slis.VIVOISF.URL;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class URLUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static URLUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(URLUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			URLUrlIterator theURL = (URLUrlIterator)findAncestorWithClass(this, URLUrlIterator.class);
			pageContext.getOut().print(theURL.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing URL for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing URL for url tag ");
		}
		return SKIP_BODY;
	}
}

