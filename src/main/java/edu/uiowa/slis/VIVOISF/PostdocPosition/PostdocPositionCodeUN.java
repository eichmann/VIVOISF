package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionCodeUNIterator thePostdocPosition = (PostdocPositionCodeUNIterator)findAncestorWithClass(this, PostdocPositionCodeUNIterator.class);
			pageContext.getOut().print(thePostdocPosition.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

