package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterHasTranslation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterHasTranslation currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterHasTranslation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LetterHasTranslationIterator theLetterHasTranslationIterator = (LetterHasTranslationIterator)findAncestorWithClass(this, LetterHasTranslationIterator.class);
			pageContext.getOut().print(theLetterHasTranslationIterator.getHasTranslation());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

