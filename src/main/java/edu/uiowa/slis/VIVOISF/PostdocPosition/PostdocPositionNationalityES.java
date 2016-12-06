package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionNationalityES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionNationalityES currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionNationalityES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionNationalityESIterator thePostdocPosition = (PostdocPositionNationalityESIterator)findAncestorWithClass(this, PostdocPositionNationalityESIterator.class);
			pageContext.getOut().print(thePostdocPosition.getNationalityES());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for nationalityES tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for nationalityES tag ");
		}
		return SKIP_BODY;
	}
}

