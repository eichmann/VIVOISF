package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterProducer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterProducer currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterProducer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterProducerIterator theConferencePosterProducerIterator = (ConferencePosterProducerIterator)findAncestorWithClass(this, ConferencePosterProducerIterator.class);
			pageContext.getOut().print(theConferencePosterProducerIterator.getProducer());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for producer tag ");
		}
		return SKIP_BODY;
	}
}

