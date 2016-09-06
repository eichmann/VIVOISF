package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WebpageInformationResourceSupportedByIterator theWebpageInformationResourceSupportedByIterator = (WebpageInformationResourceSupportedByIterator)findAncestorWithClass(this, WebpageInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theWebpageInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

