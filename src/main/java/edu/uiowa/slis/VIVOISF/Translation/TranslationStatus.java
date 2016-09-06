package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationStatus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationStatus currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationStatus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TranslationStatusIterator theTranslationStatusIterator = (TranslationStatusIterator)findAncestorWithClass(this, TranslationStatusIterator.class);
			pageContext.getOut().print(theTranslationStatusIterator.getStatus());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for status tag ");
		}
		return SKIP_BODY;
	}
}

