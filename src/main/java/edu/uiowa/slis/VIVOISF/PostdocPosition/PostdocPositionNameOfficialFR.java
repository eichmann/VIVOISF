package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionNameOfficialFRIterator thePostdocPosition = (PostdocPositionNameOfficialFRIterator)findAncestorWithClass(this, PostdocPositionNameOfficialFRIterator.class);
			pageContext.getOut().print(thePostdocPosition.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

