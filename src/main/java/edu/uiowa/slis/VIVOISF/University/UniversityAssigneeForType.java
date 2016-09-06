package edu.uiowa.slis.VIVOISF.University;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UniversityAssigneeForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UniversityAssigneeForType currentInstance = null;
	private static final Log log = LogFactory.getLog(UniversityAssigneeForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UniversityAssigneeForIterator theUniversityAssigneeForIterator = (UniversityAssigneeForIterator)findAncestorWithClass(this, UniversityAssigneeForIterator.class);
			pageContext.getOut().print(theUniversityAssigneeForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing University for assigneeFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing University for assigneeFor tag ");
		}
		return SKIP_BODY;
	}
}

