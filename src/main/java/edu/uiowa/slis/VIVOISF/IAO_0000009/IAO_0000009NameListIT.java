package edu.uiowa.slis.VIVOISF.IAO_0000009;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000009NameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000009NameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000009NameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000009NameListITIterator theIAO_0000009 = (IAO_0000009NameListITIterator)findAncestorWithClass(this, IAO_0000009NameListITIterator.class);
			pageContext.getOut().print(theIAO_0000009.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000009 for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000009 for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

