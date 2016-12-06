package edu.uiowa.slis.VIVOISF.BFO_0000008;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000008Relates extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000008Relates currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000008Relates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000008RelatesIterator theBFO_0000008RelatesIterator = (BFO_0000008RelatesIterator)findAncestorWithClass(this, BFO_0000008RelatesIterator.class);
			pageContext.getOut().print(theBFO_0000008RelatesIterator.getRelates());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000008 for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000008 for relates tag ");
		}
		return SKIP_BODY;
	}
}

