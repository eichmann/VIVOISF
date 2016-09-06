package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageFeatures extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageFeatures currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageFeatures.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WebpageFeaturesIterator theWebpageFeaturesIterator = (WebpageFeaturesIterator)findAncestorWithClass(this, WebpageFeaturesIterator.class);
			pageContext.getOut().print(theWebpageFeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for features tag ");
		}
		return SKIP_BODY;
	}
}

