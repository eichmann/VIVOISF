package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionSubjectAreaOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionSubjectAreaOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionSubjectAreaOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			geographical_regionSubjectAreaOfIterator thegeographical_regionSubjectAreaOfIterator = (geographical_regionSubjectAreaOfIterator)findAncestorWithClass(this, geographical_regionSubjectAreaOfIterator.class);
			pageContext.getOut().print(thegeographical_regionSubjectAreaOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for subjectAreaOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for subjectAreaOf tag ");
		}
		return SKIP_BODY;
	}
}

