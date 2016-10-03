package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TranslationHandleIterator theTranslation = (TranslationHandleIterator)findAncestorWithClass(this, TranslationHandleIterator.class);
			pageContext.getOut().print(theTranslation.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for handle tag ");
		}
		return SKIP_BODY;
	}
}

