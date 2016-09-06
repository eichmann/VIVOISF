package edu.uiowa.slis.VIVOISF.School;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SchoolPublisherOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SchoolPublisherOf currentInstance = null;
	private static final Log log = LogFactory.getLog(SchoolPublisherOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SchoolPublisherOfIterator theSchoolPublisherOfIterator = (SchoolPublisherOfIterator)findAncestorWithClass(this, SchoolPublisherOfIterator.class);
			pageContext.getOut().print(theSchoolPublisherOfIterator.getPublisherOf());
		} catch (Exception e) {
			log.error("Can't find enclosing School for publisherOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing School for publisherOf tag ");
		}
		return SKIP_BODY;
	}
}

