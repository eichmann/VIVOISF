package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionNameOfficialENIterator thePostdocPosition = (PostdocPositionNameOfficialENIterator)findAncestorWithClass(this, PostdocPositionNameOfficialENIterator.class);
			pageContext.getOut().print(thePostdocPosition.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

