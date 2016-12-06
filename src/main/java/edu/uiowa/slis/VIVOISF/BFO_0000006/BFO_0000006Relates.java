package edu.uiowa.slis.VIVOISF.BFO_0000006;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000006Relates extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000006Relates currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000006Relates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000006RelatesIterator theBFO_0000006RelatesIterator = (BFO_0000006RelatesIterator)findAncestorWithClass(this, BFO_0000006RelatesIterator.class);
			pageContext.getOut().print(theBFO_0000006RelatesIterator.getRelates());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000006 for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000006 for relates tag ");
		}
		return SKIP_BODY;
	}
}

