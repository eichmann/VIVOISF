package edu.uiowa.slis.VIVOISF.Division;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DivisionPublisherOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DivisionPublisherOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(DivisionPublisherOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DivisionPublisherOfIterator theDivisionPublisherOfIterator = (DivisionPublisherOfIterator)findAncestorWithClass(this, DivisionPublisherOfIterator.class);
			pageContext.getOut().print(theDivisionPublisherOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Division for publisherOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Division for publisherOf tag ");
		}
		return SKIP_BODY;
	}
}

