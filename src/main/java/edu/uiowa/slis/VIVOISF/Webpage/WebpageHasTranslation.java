package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageHasTranslation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageHasTranslation currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageHasTranslation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WebpageHasTranslationIterator theWebpageHasTranslationIterator = (WebpageHasTranslationIterator)findAncestorWithClass(this, WebpageHasTranslationIterator.class);
			pageContext.getOut().print(theWebpageHasTranslationIterator.getHasTranslation());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

