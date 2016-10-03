package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefProducer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefProducer currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefProducer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BriefProducerIterator theBriefProducerIterator = (BriefProducerIterator)findAncestorWithClass(this, BriefProducerIterator.class);
			pageContext.getOut().print(theBriefProducerIterator.getProducer());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for producer tag ");
		}
		return SKIP_BODY;
	}
}

