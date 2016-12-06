package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionCodeISO2Iterator thePostdocPosition = (PostdocPositionCodeISO2Iterator)findAncestorWithClass(this, PostdocPositionCodeISO2Iterator.class);
			pageContext.getOut().print(thePostdocPosition.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

