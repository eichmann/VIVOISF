package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StandardHandleIterator theStandard = (StandardHandleIterator)findAncestorWithClass(this, StandardHandleIterator.class);
			pageContext.getOut().print(theStandard.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for handle tag ");
		}
		return SKIP_BODY;
	}
}

