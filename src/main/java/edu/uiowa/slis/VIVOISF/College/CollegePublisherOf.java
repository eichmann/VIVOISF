package edu.uiowa.slis.VIVOISF.College;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollegePublisherOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollegePublisherOf currentInstance = null;
	private static final Log log = LogFactory.getLog(CollegePublisherOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollegePublisherOfIterator theCollegePublisherOfIterator = (CollegePublisherOfIterator)findAncestorWithClass(this, CollegePublisherOfIterator.class);
			pageContext.getOut().print(theCollegePublisherOfIterator.getPublisherOf());
		} catch (Exception e) {
			log.error("Can't find enclosing College for publisherOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing College for publisherOf tag ");
		}
		return SKIP_BODY;
	}
}

