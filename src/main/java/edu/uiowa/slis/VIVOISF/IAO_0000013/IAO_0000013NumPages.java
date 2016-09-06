package edu.uiowa.slis.VIVOISF.IAO_0000013;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000013NumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000013NumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000013NumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000013NumPagesIterator theIAO_0000013 = (IAO_0000013NumPagesIterator)findAncestorWithClass(this, IAO_0000013NumPagesIterator.class);
			pageContext.getOut().print(theIAO_0000013.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000013 for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000013 for numPages tag ");
		}
		return SKIP_BODY;
	}
}

