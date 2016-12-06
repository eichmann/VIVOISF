package edu.uiowa.slis.VIVOISF.BFO_0000038;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000038Publisher extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000038Publisher currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000038Publisher.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000038PublisherIterator theBFO_0000038PublisherIterator = (BFO_0000038PublisherIterator)findAncestorWithClass(this, BFO_0000038PublisherIterator.class);
			pageContext.getOut().print(theBFO_0000038PublisherIterator.getPublisher());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000038 for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000038 for publisher tag ");
		}
		return SKIP_BODY;
	}
}

