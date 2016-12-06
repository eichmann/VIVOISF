package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionNameOfficialARIterator thePostdocPosition = (PostdocPositionNameOfficialARIterator)findAncestorWithClass(this, PostdocPositionNameOfficialARIterator.class);
			pageContext.getOut().print(thePostdocPosition.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

