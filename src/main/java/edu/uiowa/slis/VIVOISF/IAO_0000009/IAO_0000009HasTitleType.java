package edu.uiowa.slis.VIVOISF.IAO_0000009;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000009HasTitleType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000009HasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000009HasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000009HasTitleIterator theIAO_0000009HasTitleIterator = (IAO_0000009HasTitleIterator)findAncestorWithClass(this, IAO_0000009HasTitleIterator.class);
			pageContext.getOut().print(theIAO_0000009HasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000009 for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000009 for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

