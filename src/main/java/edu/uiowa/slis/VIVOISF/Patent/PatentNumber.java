package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PatentNumberIterator thePatent = (PatentNumberIterator)findAncestorWithClass(this, PatentNumberIterator.class);
			pageContext.getOut().print(thePatent.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for number tag ");
		}
		return SKIP_BODY;
	}
}

