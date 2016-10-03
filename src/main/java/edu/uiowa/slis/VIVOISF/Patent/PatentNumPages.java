package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PatentNumPagesIterator thePatent = (PatentNumPagesIterator)findAncestorWithClass(this, PatentNumPagesIterator.class);
			pageContext.getOut().print(thePatent.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for numPages tag ");
		}
		return SKIP_BODY;
	}
}

