package edu.uiowa.slis.VIVOISF.IAO_0000009;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000009Relates extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000009Relates currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000009Relates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000009RelatesIterator theIAO_0000009RelatesIterator = (IAO_0000009RelatesIterator)findAncestorWithClass(this, IAO_0000009RelatesIterator.class);
			pageContext.getOut().print(theIAO_0000009RelatesIterator.getRelates());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000009 for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000009 for relates tag ");
		}
		return SKIP_BODY;
	}
}

