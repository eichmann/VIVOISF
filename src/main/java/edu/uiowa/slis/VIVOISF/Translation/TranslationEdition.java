package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TranslationEditionIterator theTranslation = (TranslationEditionIterator)findAncestorWithClass(this, TranslationEditionIterator.class);
			pageContext.getOut().print(theTranslation.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for edition tag ");
		}
		return SKIP_BODY;
	}
}

