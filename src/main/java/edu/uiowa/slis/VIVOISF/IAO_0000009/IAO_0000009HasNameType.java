package edu.uiowa.slis.VIVOISF.IAO_0000009;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000009HasNameType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000009HasNameType currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000009HasNameType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000009HasNameIterator theIAO_0000009HasNameIterator = (IAO_0000009HasNameIterator)findAncestorWithClass(this, IAO_0000009HasNameIterator.class);
			pageContext.getOut().print(theIAO_0000009HasNameIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000009 for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000009 for hasName tag ");
		}
		return SKIP_BODY;
	}
}

