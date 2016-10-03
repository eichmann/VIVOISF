package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationReviewOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationReviewOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationReviewOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TranslationReviewOfIterator theTranslationReviewOfIterator = (TranslationReviewOfIterator)findAncestorWithClass(this, TranslationReviewOfIterator.class);
			pageContext.getOut().print(theTranslationReviewOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

