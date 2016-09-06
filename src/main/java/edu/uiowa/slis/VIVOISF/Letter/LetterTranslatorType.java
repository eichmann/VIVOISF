package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LetterTranslatorIterator theLetterTranslatorIterator = (LetterTranslatorIterator)findAncestorWithClass(this, LetterTranslatorIterator.class);
			pageContext.getOut().print(theLetterTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for translator tag ");
		}
		return SKIP_BODY;
	}
}

