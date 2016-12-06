package edu.uiowa.slis.VIVOISF.IAO_0000030;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000030Relates extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000030Relates currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000030Relates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000030RelatesIterator theIAO_0000030RelatesIterator = (IAO_0000030RelatesIterator)findAncestorWithClass(this, IAO_0000030RelatesIterator.class);
			pageContext.getOut().print(theIAO_0000030RelatesIterator.getRelates());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000030 for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000030 for relates tag ");
		}
		return SKIP_BODY;
	}
}

