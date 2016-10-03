package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TranslationGtin14Iterator theTranslation = (TranslationGtin14Iterator)findAncestorWithClass(this, TranslationGtin14Iterator.class);
			pageContext.getOut().print(theTranslation.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

