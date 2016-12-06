package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionNameListENIterator thePostdocPosition = (PostdocPositionNameListENIterator)findAncestorWithClass(this, PostdocPositionNameListENIterator.class);
			pageContext.getOut().print(thePostdocPosition.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

