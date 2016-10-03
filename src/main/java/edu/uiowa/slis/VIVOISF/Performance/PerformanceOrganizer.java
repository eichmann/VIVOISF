package edu.uiowa.slis.VIVOISF.Performance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PerformanceOrganizer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PerformanceOrganizer currentInstance = null;
	private static final Log log = LogFactory.getLog(PerformanceOrganizer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PerformanceOrganizerIterator thePerformanceOrganizerIterator = (PerformanceOrganizerIterator)findAncestorWithClass(this, PerformanceOrganizerIterator.class);
			pageContext.getOut().print(thePerformanceOrganizerIterator.getOrganizer());
		} catch (Exception e) {
			log.error("Can't find enclosing Performance for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Performance for organizer tag ");
		}
		return SKIP_BODY;
	}
}

