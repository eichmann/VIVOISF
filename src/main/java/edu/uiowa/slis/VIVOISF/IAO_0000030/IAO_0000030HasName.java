package edu.uiowa.slis.VIVOISF.IAO_0000030;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000030HasName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000030HasName currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000030HasName.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000030HasNameIterator theIAO_0000030HasNameIterator = (IAO_0000030HasNameIterator)findAncestorWithClass(this, IAO_0000030HasNameIterator.class);
			pageContext.getOut().print(theIAO_0000030HasNameIterator.getHasName());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000030 for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000030 for hasName tag ");
		}
		return SKIP_BODY;
	}
}

