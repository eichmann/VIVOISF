package edu.uiowa.slis.VIVOISF.Website;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebsiteInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebsiteInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(WebsiteInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WebsiteInformationResourceSupportedByIterator theWebsiteInformationResourceSupportedByIterator = (WebsiteInformationResourceSupportedByIterator)findAncestorWithClass(this, WebsiteInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theWebsiteInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Website for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Website for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

