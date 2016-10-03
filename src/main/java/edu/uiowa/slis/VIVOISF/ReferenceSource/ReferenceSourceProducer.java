package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceProducer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceProducer currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceProducer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceProducerIterator theReferenceSourceProducerIterator = (ReferenceSourceProducerIterator)findAncestorWithClass(this, ReferenceSourceProducerIterator.class);
			pageContext.getOut().print(theReferenceSourceProducerIterator.getProducer());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for producer tag ");
		}
		return SKIP_BODY;
	}
}

