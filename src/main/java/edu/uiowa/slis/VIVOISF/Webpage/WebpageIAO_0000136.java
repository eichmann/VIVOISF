package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageIAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageIAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageIAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WebpageIAO_0000136Iterator theWebpageIAO_0000136Iterator = (WebpageIAO_0000136Iterator)findAncestorWithClass(this, WebpageIAO_0000136Iterator.class);
			pageContext.getOut().print(theWebpageIAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

