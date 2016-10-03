package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuoteProducer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuoteProducer currentInstance = null;
	private static final Log log = LogFactory.getLog(QuoteProducer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			QuoteProducerIterator theQuoteProducerIterator = (QuoteProducerIterator)findAncestorWithClass(this, QuoteProducerIterator.class);
			pageContext.getOut().print(theQuoteProducerIterator.getProducer());
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for producer tag ");
		}
		return SKIP_BODY;
	}
}

