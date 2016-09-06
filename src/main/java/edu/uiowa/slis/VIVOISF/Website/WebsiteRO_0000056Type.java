package edu.uiowa.slis.VIVOISF.Website;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebsiteRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebsiteRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(WebsiteRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WebsiteRO_0000056Iterator theWebsiteRO_0000056Iterator = (WebsiteRO_0000056Iterator)findAncestorWithClass(this, WebsiteRO_0000056Iterator.class);
			pageContext.getOut().print(theWebsiteRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Website for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Website for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

