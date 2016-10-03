package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TranslationIsbn10Iterator theTranslation = (TranslationIsbn10Iterator)findAncestorWithClass(this, TranslationIsbn10Iterator.class);
			pageContext.getOut().print(theTranslation.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

