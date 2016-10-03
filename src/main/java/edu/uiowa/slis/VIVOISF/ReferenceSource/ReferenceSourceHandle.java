package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceHandleIterator theReferenceSource = (ReferenceSourceHandleIterator)findAncestorWithClass(this, ReferenceSourceHandleIterator.class);
			pageContext.getOut().print(theReferenceSource.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for handle tag ");
		}
		return SKIP_BODY;
	}
}

