package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentContent currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PatentContentIterator thePatent = (PatentContentIterator)findAncestorWithClass(this, PatentContentIterator.class);
			pageContext.getOut().print(thePatent.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for content tag ");
		}
		return SKIP_BODY;
	}
}

