package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionHasTitleType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionHasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionHasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionHasTitleIterator thePostdocPositionHasTitleIterator = (PostdocPositionHasTitleIterator)findAncestorWithClass(this, PostdocPositionHasTitleIterator.class);
			pageContext.getOut().print(thePostdocPositionHasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}
