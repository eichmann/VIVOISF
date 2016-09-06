package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterHasTranslationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterHasTranslationType currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterHasTranslationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LetterHasTranslationIterator theLetterHasTranslationIterator = (LetterHasTranslationIterator)findAncestorWithClass(this, LetterHasTranslationIterator.class);
			pageContext.getOut().print(theLetterHasTranslationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

