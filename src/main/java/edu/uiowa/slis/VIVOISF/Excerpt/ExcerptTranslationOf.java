package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptTranslationOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptTranslationOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptTranslationOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExcerptTranslationOfIterator theExcerptTranslationOfIterator = (ExcerptTranslationOfIterator)findAncestorWithClass(this, ExcerptTranslationOfIterator.class);
			pageContext.getOut().print(theExcerptTranslationOfIterator.getTranslationOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

