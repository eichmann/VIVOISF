package edu.uiowa.slis.VIVOISF.BFO_0000148;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000148Relates extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000148Relates currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000148Relates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000148RelatesIterator theBFO_0000148RelatesIterator = (BFO_0000148RelatesIterator)findAncestorWithClass(this, BFO_0000148RelatesIterator.class);
			pageContext.getOut().print(theBFO_0000148RelatesIterator.getRelates());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000148 for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000148 for relates tag ");
		}
		return SKIP_BODY;
	}
}

