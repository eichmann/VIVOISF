package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TranslationIsbn13Iterator theTranslation = (TranslationIsbn13Iterator)findAncestorWithClass(this, TranslationIsbn13Iterator.class);
			pageContext.getOut().print(theTranslation.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

