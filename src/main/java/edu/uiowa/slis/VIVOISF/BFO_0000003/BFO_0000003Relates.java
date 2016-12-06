package edu.uiowa.slis.VIVOISF.BFO_0000003;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000003Relates extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000003Relates currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000003Relates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000003RelatesIterator theBFO_0000003RelatesIterator = (BFO_0000003RelatesIterator)findAncestorWithClass(this, BFO_0000003RelatesIterator.class);
			pageContext.getOut().print(theBFO_0000003RelatesIterator.getRelates());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000003 for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000003 for relates tag ");
		}
		return SKIP_BODY;
	}
}

