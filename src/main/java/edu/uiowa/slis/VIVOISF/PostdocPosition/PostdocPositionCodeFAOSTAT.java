package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionCodeFAOSTATIterator thePostdocPosition = (PostdocPositionCodeFAOSTATIterator)findAncestorWithClass(this, PostdocPositionCodeFAOSTATIterator.class);
			pageContext.getOut().print(thePostdocPosition.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}

