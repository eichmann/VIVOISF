package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentPages currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PatentPagesIterator thePatent = (PatentPagesIterator)findAncestorWithClass(this, PatentPagesIterator.class);
			pageContext.getOut().print(thePatent.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for pages tag ");
		}
		return SKIP_BODY;
	}
}

