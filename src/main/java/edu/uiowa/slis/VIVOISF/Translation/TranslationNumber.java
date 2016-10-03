package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TranslationNumberIterator theTranslation = (TranslationNumberIterator)findAncestorWithClass(this, TranslationNumberIterator.class);
			pageContext.getOut().print(theTranslation.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for number tag ");
		}
		return SKIP_BODY;
	}
}

