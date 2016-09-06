package edu.uiowa.slis.VIVOISF.College;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollegePublisherOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollegePublisherOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollegePublisherOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollegePublisherOfIterator theCollegePublisherOfIterator = (CollegePublisherOfIterator)findAncestorWithClass(this, CollegePublisherOfIterator.class);
			pageContext.getOut().print(theCollegePublisherOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing College for publisherOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing College for publisherOf tag ");
		}
		return SKIP_BODY;
	}
}

