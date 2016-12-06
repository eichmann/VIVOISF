package edu.uiowa.slis.VIVOISF.BFO_0000141;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000141PublisherType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000141PublisherType currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000141PublisherType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000141PublisherIterator theBFO_0000141PublisherIterator = (BFO_0000141PublisherIterator)findAncestorWithClass(this, BFO_0000141PublisherIterator.class);
			pageContext.getOut().print(theBFO_0000141PublisherIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000141 for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000141 for publisher tag ");
		}
		return SKIP_BODY;
	}
}

