package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExcerptTranslatorIterator theExcerptTranslatorIterator = (ExcerptTranslatorIterator)findAncestorWithClass(this, ExcerptTranslatorIterator.class);
			pageContext.getOut().print(theExcerptTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for translator tag ");
		}
		return SKIP_BODY;
	}
}

