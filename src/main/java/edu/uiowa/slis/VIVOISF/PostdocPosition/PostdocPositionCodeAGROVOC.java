package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionCodeAGROVOCIterator thePostdocPosition = (PostdocPositionCodeAGROVOCIterator)findAncestorWithClass(this, PostdocPositionCodeAGROVOCIterator.class);
			pageContext.getOut().print(thePostdocPosition.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

