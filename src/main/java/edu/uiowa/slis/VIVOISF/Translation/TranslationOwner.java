package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationOwner extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationOwner currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationOwner.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TranslationOwnerIterator theTranslationOwnerIterator = (TranslationOwnerIterator)findAncestorWithClass(this, TranslationOwnerIterator.class);
			pageContext.getOut().print(theTranslationOwnerIterator.getOwner());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for owner tag ");
		}
		return SKIP_BODY;
	}
}

