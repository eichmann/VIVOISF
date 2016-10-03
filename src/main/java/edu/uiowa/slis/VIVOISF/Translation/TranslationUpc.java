package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TranslationUpcIterator theTranslation = (TranslationUpcIterator)findAncestorWithClass(this, TranslationUpcIterator.class);
			pageContext.getOut().print(theTranslation.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for upc tag ");
		}
		return SKIP_BODY;
	}
}

