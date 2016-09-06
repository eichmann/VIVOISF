package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TranslationTheAbstractIterator theTranslation = (TranslationTheAbstractIterator)findAncestorWithClass(this, TranslationTheAbstractIterator.class);
			pageContext.getOut().print(theTranslation.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

