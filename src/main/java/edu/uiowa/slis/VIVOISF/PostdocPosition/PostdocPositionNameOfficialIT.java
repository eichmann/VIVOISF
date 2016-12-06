package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionNameOfficialITIterator thePostdocPosition = (PostdocPositionNameOfficialITIterator)findAncestorWithClass(this, PostdocPositionNameOfficialITIterator.class);
			pageContext.getOut().print(thePostdocPosition.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

