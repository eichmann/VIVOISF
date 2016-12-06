package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionCodeISO3Iterator thePostdocPosition = (PostdocPositionCodeISO3Iterator)findAncestorWithClass(this, PostdocPositionCodeISO3Iterator.class);
			pageContext.getOut().print(thePostdocPosition.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}

