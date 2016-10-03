package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TranslationNumPagesIterator theTranslation = (TranslationNumPagesIterator)findAncestorWithClass(this, TranslationNumPagesIterator.class);
			pageContext.getOut().print(theTranslation.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for numPages tag ");
		}
		return SKIP_BODY;
	}
}

