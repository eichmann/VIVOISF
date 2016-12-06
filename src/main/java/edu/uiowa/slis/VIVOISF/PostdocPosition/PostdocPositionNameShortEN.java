package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionNameShortENIterator thePostdocPosition = (PostdocPositionNameShortENIterator)findAncestorWithClass(this, PostdocPositionNameShortENIterator.class);
			pageContext.getOut().print(thePostdocPosition.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

