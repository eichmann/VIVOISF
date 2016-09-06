package edu.uiowa.slis.VIVOISF.IAO_0000013;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000013StatusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000013StatusType currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000013StatusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000013StatusIterator theIAO_0000013StatusIterator = (IAO_0000013StatusIterator)findAncestorWithClass(this, IAO_0000013StatusIterator.class);
			pageContext.getOut().print(theIAO_0000013StatusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000013 for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000013 for status tag ");
		}
		return SKIP_BODY;
	}
}

