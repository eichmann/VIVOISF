package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionNationalityRUIterator thePostdocPosition = (PostdocPositionNationalityRUIterator)findAncestorWithClass(this, PostdocPositionNationalityRUIterator.class);
			pageContext.getOut().print(thePostdocPosition.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

