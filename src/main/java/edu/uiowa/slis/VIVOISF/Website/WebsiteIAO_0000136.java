package edu.uiowa.slis.VIVOISF.Website;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebsiteIAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebsiteIAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(WebsiteIAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WebsiteIAO_0000136Iterator theWebsiteIAO_0000136Iterator = (WebsiteIAO_0000136Iterator)findAncestorWithClass(this, WebsiteIAO_0000136Iterator.class);
			pageContext.getOut().print(theWebsiteIAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing Website for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Website for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

