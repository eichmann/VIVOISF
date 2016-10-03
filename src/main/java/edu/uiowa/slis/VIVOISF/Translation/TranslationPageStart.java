package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationPageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationPageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationPageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TranslationPageStartIterator theTranslation = (TranslationPageStartIterator)findAncestorWithClass(this, TranslationPageStartIterator.class);
			pageContext.getOut().print(theTranslation.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

