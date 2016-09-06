package edu.uiowa.slis.VIVOISF.University;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UniversityPublisherOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UniversityPublisherOf currentInstance = null;
	private static final Log log = LogFactory.getLog(UniversityPublisherOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UniversityPublisherOfIterator theUniversityPublisherOfIterator = (UniversityPublisherOfIterator)findAncestorWithClass(this, UniversityPublisherOfIterator.class);
			pageContext.getOut().print(theUniversityPublisherOfIterator.getPublisherOf());
		} catch (Exception e) {
			log.error("Can't find enclosing University for publisherOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing University for publisherOf tag ");
		}
		return SKIP_BODY;
	}
}

