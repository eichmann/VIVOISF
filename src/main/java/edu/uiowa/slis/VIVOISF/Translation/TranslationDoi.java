package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TranslationDoiIterator theTranslation = (TranslationDoiIterator)findAncestorWithClass(this, TranslationDoiIterator.class);
			pageContext.getOut().print(theTranslation.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for doi tag ");
		}
		return SKIP_BODY;
	}
}

