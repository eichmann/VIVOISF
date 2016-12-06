package edu.uiowa.slis.VIVOISF.IAO_0000009;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000009NameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000009NameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000009NameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000009NameListZHIterator theIAO_0000009 = (IAO_0000009NameListZHIterator)findAncestorWithClass(this, IAO_0000009NameListZHIterator.class);
			pageContext.getOut().print(theIAO_0000009.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000009 for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000009 for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

