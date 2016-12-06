package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionCodeUNDPIterator thePostdocPosition = (PostdocPositionCodeUNDPIterator)findAncestorWithClass(this, PostdocPositionCodeUNDPIterator.class);
			pageContext.getOut().print(thePostdocPosition.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}

