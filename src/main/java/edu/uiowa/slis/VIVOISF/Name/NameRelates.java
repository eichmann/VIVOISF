package edu.uiowa.slis.VIVOISF.Name;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NameRelates extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NameRelates currentInstance = null;
	private static final Log log = LogFactory.getLog(NameRelates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NameRelatesIterator theNameRelatesIterator = (NameRelatesIterator)findAncestorWithClass(this, NameRelatesIterator.class);
			pageContext.getOut().print(theNameRelatesIterator.getRelates());
		} catch (Exception e) {
			log.error("Can't find enclosing Name for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Name for relates tag ");
		}
		return SKIP_BODY;
	}
}

