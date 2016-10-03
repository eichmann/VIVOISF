package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationSici currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TranslationSiciIterator theTranslation = (TranslationSiciIterator)findAncestorWithClass(this, TranslationSiciIterator.class);
			pageContext.getOut().print(theTranslation.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for sici tag ");
		}
		return SKIP_BODY;
	}
}

