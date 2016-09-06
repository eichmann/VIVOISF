package edu.uiowa.slis.VIVOISF.IAO_0000013;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000013RelatesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000013RelatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000013RelatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000013RelatesIterator theIAO_0000013RelatesIterator = (IAO_0000013RelatesIterator)findAncestorWithClass(this, IAO_0000013RelatesIterator.class);
			pageContext.getOut().print(theIAO_0000013RelatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000013 for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000013 for relates tag ");
		}
		return SKIP_BODY;
	}
}

