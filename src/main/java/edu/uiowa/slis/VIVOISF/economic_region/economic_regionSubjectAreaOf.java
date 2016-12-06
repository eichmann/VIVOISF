package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionSubjectAreaOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionSubjectAreaOf currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionSubjectAreaOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			economic_regionSubjectAreaOfIterator theeconomic_regionSubjectAreaOfIterator = (economic_regionSubjectAreaOfIterator)findAncestorWithClass(this, economic_regionSubjectAreaOfIterator.class);
			pageContext.getOut().print(theeconomic_regionSubjectAreaOfIterator.getSubjectAreaOf());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for subjectAreaOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for subjectAreaOf tag ");
		}
		return SKIP_BODY;
	}
}

