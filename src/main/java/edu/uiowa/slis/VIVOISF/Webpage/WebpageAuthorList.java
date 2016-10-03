package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageAuthorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageAuthorList currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageAuthorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WebpageAuthorListIterator theWebpageAuthorListIterator = (WebpageAuthorListIterator)findAncestorWithClass(this, WebpageAuthorListIterator.class);
			pageContext.getOut().print(theWebpageAuthorListIterator.getAuthorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for authorList tag ");
		}
		return SKIP_BODY;
	}
}

