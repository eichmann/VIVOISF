package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationProducerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationProducerType currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationProducerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TranslationProducerIterator theTranslationProducerIterator = (TranslationProducerIterator)findAncestorWithClass(this, TranslationProducerIterator.class);
			pageContext.getOut().print(theTranslationProducerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for producer tag ");
		}
		return SKIP_BODY;
	}
}

