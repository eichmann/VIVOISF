package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptTranslationOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptTranslationOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptTranslationOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExcerptTranslationOfIterator theExcerptTranslationOfIterator = (ExcerptTranslationOfIterator)findAncestorWithClass(this, ExcerptTranslationOfIterator.class);
			pageContext.getOut().print(theExcerptTranslationOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

