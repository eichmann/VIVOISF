package edu.uiowa.slis.VIVOISF.BFO_0000004;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000004Publisher extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000004Publisher currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000004Publisher.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000004PublisherIterator theBFO_0000004PublisherIterator = (BFO_0000004PublisherIterator)findAncestorWithClass(this, BFO_0000004PublisherIterator.class);
			pageContext.getOut().print(theBFO_0000004PublisherIterator.getPublisher());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000004 for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000004 for publisher tag ");
		}
		return SKIP_BODY;
	}
}
