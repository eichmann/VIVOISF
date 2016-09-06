package edu.uiowa.slis.VIVOISF.Website;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebsiteFeatures extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebsiteFeatures currentInstance = null;
	private static final Log log = LogFactory.getLog(WebsiteFeatures.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WebsiteFeaturesIterator theWebsiteFeaturesIterator = (WebsiteFeaturesIterator)findAncestorWithClass(this, WebsiteFeaturesIterator.class);
			pageContext.getOut().print(theWebsiteFeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing Website for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Website for features tag ");
		}
		return SKIP_BODY;
	}
}

