package edu.uiowa.slis.VIVOISF.IAO_0000009;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000009HasURLType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000009HasURLType currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000009HasURLType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000009HasURLIterator theIAO_0000009HasURLIterator = (IAO_0000009HasURLIterator)findAncestorWithClass(this, IAO_0000009HasURLIterator.class);
			pageContext.getOut().print(theIAO_0000009HasURLIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000009 for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000009 for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

