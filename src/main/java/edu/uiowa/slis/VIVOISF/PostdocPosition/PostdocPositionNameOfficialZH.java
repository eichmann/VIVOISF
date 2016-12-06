package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionNameOfficialZHIterator thePostdocPosition = (PostdocPositionNameOfficialZHIterator)findAncestorWithClass(this, PostdocPositionNameOfficialZHIterator.class);
			pageContext.getOut().print(thePostdocPosition.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

