package edu.uiowa.slis.VIVOISF.BFO_0000020;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000020Relates extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000020Relates currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000020Relates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000020RelatesIterator theBFO_0000020RelatesIterator = (BFO_0000020RelatesIterator)findAncestorWithClass(this, BFO_0000020RelatesIterator.class);
			pageContext.getOut().print(theBFO_0000020RelatesIterator.getRelates());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000020 for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000020 for relates tag ");
		}
		return SKIP_BODY;
	}
}

