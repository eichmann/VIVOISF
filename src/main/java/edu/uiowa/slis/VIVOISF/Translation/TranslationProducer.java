package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationProducer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationProducer currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationProducer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TranslationProducerIterator theTranslationProducerIterator = (TranslationProducerIterator)findAncestorWithClass(this, TranslationProducerIterator.class);
			pageContext.getOut().print(theTranslationProducerIterator.getProducer());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for producer tag ");
		}
		return SKIP_BODY;
	}
}

