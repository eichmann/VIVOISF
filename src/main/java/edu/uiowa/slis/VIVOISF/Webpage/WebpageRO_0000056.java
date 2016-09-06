package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WebpageRO_0000056Iterator theWebpageRO_0000056Iterator = (WebpageRO_0000056Iterator)findAncestorWithClass(this, WebpageRO_0000056Iterator.class);
			pageContext.getOut().print(theWebpageRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

