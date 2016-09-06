package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterTranslationOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterTranslationOf currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterTranslationOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LetterTranslationOfIterator theLetterTranslationOfIterator = (LetterTranslationOfIterator)findAncestorWithClass(this, LetterTranslationOfIterator.class);
			pageContext.getOut().print(theLetterTranslationOfIterator.getTranslationOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

