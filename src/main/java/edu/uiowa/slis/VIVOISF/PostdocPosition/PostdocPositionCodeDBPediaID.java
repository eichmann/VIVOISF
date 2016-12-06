package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionCodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionCodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionCodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionCodeDBPediaIDIterator thePostdocPosition = (PostdocPositionCodeDBPediaIDIterator)findAncestorWithClass(this, PostdocPositionCodeDBPediaIDIterator.class);
			pageContext.getOut().print(thePostdocPosition.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

