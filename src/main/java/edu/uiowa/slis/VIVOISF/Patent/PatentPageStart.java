package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentPageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentPageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentPageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PatentPageStartIterator thePatent = (PatentPageStartIterator)findAncestorWithClass(this, PatentPageStartIterator.class);
			pageContext.getOut().print(thePatent.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

