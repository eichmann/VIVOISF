package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentStatus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentStatus currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentStatus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PatentStatusIterator thePatentStatusIterator = (PatentStatusIterator)findAncestorWithClass(this, PatentStatusIterator.class);
			pageContext.getOut().print(thePatentStatusIterator.getStatus());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for status tag ");
		}
		return SKIP_BODY;
	}
}

