package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionNameOfficialESIterator thePostdocPosition = (PostdocPositionNameOfficialESIterator)findAncestorWithClass(this, PostdocPositionNameOfficialESIterator.class);
			pageContext.getOut().print(thePostdocPosition.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

