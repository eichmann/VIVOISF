package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TranslationIdentifierIterator theTranslation = (TranslationIdentifierIterator)findAncestorWithClass(this, TranslationIdentifierIterator.class);
			pageContext.getOut().print(theTranslation.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for identifier tag ");
		}
		return SKIP_BODY;
	}
}

