package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentCclCode extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentCclCode currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentCclCode.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PatentCclCodeIterator thePatent = (PatentCclCodeIterator)findAncestorWithClass(this, PatentCclCodeIterator.class);
			pageContext.getOut().print(thePatent.getCclCode());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for cclCode tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for cclCode tag ");
		}
		return SKIP_BODY;
	}
}

