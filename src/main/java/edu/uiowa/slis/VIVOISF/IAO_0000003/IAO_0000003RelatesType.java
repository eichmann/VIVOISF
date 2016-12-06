package edu.uiowa.slis.VIVOISF.IAO_0000003;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000003RelatesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000003RelatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000003RelatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000003RelatesIterator theIAO_0000003RelatesIterator = (IAO_0000003RelatesIterator)findAncestorWithClass(this, IAO_0000003RelatesIterator.class);
			pageContext.getOut().print(theIAO_0000003RelatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000003 for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000003 for relates tag ");
		}
		return SKIP_BODY;
	}
}

