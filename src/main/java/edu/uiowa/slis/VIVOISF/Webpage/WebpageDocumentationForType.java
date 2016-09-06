package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageDocumentationForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageDocumentationForType currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageDocumentationForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WebpageDocumentationForIterator theWebpageDocumentationForIterator = (WebpageDocumentationForIterator)findAncestorWithClass(this, WebpageDocumentationForIterator.class);
			pageContext.getOut().print(theWebpageDocumentationForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

