package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterProducer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterProducer currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterProducer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LetterProducerIterator theLetterProducerIterator = (LetterProducerIterator)findAncestorWithClass(this, LetterProducerIterator.class);
			pageContext.getOut().print(theLetterProducerIterator.getProducer());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for producer tag ");
		}
		return SKIP_BODY;
	}
}

