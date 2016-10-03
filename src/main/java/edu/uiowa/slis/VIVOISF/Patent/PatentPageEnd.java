package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentPageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentPageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentPageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PatentPageEndIterator thePatent = (PatentPageEndIterator)findAncestorWithClass(this, PatentPageEndIterator.class);
			pageContext.getOut().print(thePatent.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

