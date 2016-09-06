package edu.uiowa.slis.VIVOISF.School;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SchoolPublisherOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SchoolPublisherOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(SchoolPublisherOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SchoolPublisherOfIterator theSchoolPublisherOfIterator = (SchoolPublisherOfIterator)findAncestorWithClass(this, SchoolPublisherOfIterator.class);
			pageContext.getOut().print(theSchoolPublisherOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing School for publisherOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing School for publisherOf tag ");
		}
		return SKIP_BODY;
	}
}

