package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WebpageIsbn13Iterator theWebpage = (WebpageIsbn13Iterator)findAncestorWithClass(this, WebpageIsbn13Iterator.class);
			pageContext.getOut().print(theWebpage.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

