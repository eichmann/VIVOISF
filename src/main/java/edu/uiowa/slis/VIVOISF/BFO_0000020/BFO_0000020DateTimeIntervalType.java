package edu.uiowa.slis.VIVOISF.BFO_0000020;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000020DateTimeIntervalType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000020DateTimeIntervalType currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000020DateTimeIntervalType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000020DateTimeIntervalIterator theBFO_0000020DateTimeIntervalIterator = (BFO_0000020DateTimeIntervalIterator)findAncestorWithClass(this, BFO_0000020DateTimeIntervalIterator.class);
			pageContext.getOut().print(theBFO_0000020DateTimeIntervalIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000020 for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000020 for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

