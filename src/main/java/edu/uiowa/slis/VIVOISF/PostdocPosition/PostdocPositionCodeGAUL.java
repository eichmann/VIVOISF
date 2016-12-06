package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionCodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionCodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionCodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionCodeGAULIterator thePostdocPosition = (PostdocPositionCodeGAULIterator)findAncestorWithClass(this, PostdocPositionCodeGAULIterator.class);
			pageContext.getOut().print(thePostdocPosition.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}

