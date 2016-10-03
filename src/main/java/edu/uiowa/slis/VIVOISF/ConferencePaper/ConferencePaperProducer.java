package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperProducer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperProducer currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperProducer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperProducerIterator theConferencePaperProducerIterator = (ConferencePaperProducerIterator)findAncestorWithClass(this, ConferencePaperProducerIterator.class);
			pageContext.getOut().print(theConferencePaperProducerIterator.getProducer());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for producer tag ");
		}
		return SKIP_BODY;
	}
}

