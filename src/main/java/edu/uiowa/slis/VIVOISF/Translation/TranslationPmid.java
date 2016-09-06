package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationPmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationPmid currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationPmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TranslationPmidIterator theTranslation = (TranslationPmidIterator)findAncestorWithClass(this, TranslationPmidIterator.class);
			pageContext.getOut().print(theTranslation.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for pmid tag ");
		}
		return SKIP_BODY;
	}
}

