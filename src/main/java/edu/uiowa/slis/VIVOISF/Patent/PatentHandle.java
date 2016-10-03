package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PatentHandleIterator thePatent = (PatentHandleIterator)findAncestorWithClass(this, PatentHandleIterator.class);
			pageContext.getOut().print(thePatent.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for handle tag ");
		}
		return SKIP_BODY;
	}
}

