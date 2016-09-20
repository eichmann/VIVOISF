package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WebpageERO_0000045Iterator theWebpage = (WebpageERO_0000045Iterator)findAncestorWithClass(this, WebpageERO_0000045Iterator.class);
			pageContext.getOut().print(theWebpage.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

