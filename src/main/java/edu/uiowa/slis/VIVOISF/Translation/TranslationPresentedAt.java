package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationPresentedAt extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationPresentedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationPresentedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TranslationPresentedAtIterator theTranslationPresentedAtIterator = (TranslationPresentedAtIterator)findAncestorWithClass(this, TranslationPresentedAtIterator.class);
			pageContext.getOut().print(theTranslationPresentedAtIterator.getPresentedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

