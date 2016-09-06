package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageTranslator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageTranslator currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageTranslator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WebpageTranslatorIterator theWebpageTranslatorIterator = (WebpageTranslatorIterator)findAncestorWithClass(this, WebpageTranslatorIterator.class);
			pageContext.getOut().print(theWebpageTranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for translator tag ");
		}
		return SKIP_BODY;
	}
}

