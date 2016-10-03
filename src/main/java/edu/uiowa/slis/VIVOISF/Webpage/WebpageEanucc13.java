package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WebpageEanucc13Iterator theWebpage = (WebpageEanucc13Iterator)findAncestorWithClass(this, WebpageEanucc13Iterator.class);
			pageContext.getOut().print(theWebpage.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

