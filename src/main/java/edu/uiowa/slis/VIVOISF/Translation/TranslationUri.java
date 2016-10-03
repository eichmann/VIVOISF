package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationUri currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TranslationUriIterator theTranslation = (TranslationUriIterator)findAncestorWithClass(this, TranslationUriIterator.class);
			pageContext.getOut().print(theTranslation.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for uri tag ");
		}
		return SKIP_BODY;
	}
}
