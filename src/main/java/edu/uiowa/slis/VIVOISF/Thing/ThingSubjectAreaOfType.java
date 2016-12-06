package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingSubjectAreaOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingSubjectAreaOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingSubjectAreaOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingSubjectAreaOfIterator theThingSubjectAreaOfIterator = (ThingSubjectAreaOfIterator)findAncestorWithClass(this, ThingSubjectAreaOfIterator.class);
			pageContext.getOut().print(theThingSubjectAreaOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for subjectAreaOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for subjectAreaOf tag ");
		}
		return SKIP_BODY;
	}
}

