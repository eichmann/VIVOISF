package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentStatusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentStatusType currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentStatusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PatentStatusIterator thePatentStatusIterator = (PatentStatusIterator)findAncestorWithClass(this, PatentStatusIterator.class);
			pageContext.getOut().print(thePatentStatusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for status tag ");
		}
		return SKIP_BODY;
	}
}

