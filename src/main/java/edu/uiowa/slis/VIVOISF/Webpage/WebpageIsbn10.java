package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WebpageIsbn10Iterator theWebpage = (WebpageIsbn10Iterator)findAncestorWithClass(this, WebpageIsbn10Iterator.class);
			pageContext.getOut().print(theWebpage.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

