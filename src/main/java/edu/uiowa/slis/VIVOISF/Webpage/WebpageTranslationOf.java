package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageTranslationOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageTranslationOf currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageTranslationOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WebpageTranslationOfIterator theWebpageTranslationOfIterator = (WebpageTranslationOfIterator)findAncestorWithClass(this, WebpageTranslationOfIterator.class);
			pageContext.getOut().print(theWebpageTranslationOfIterator.getTranslationOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

