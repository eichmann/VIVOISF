package edu.uiowa.slis.VIVOISF.College;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollegeAssigneeForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollegeAssigneeForType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollegeAssigneeForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollegeAssigneeForIterator theCollegeAssigneeForIterator = (CollegeAssigneeForIterator)findAncestorWithClass(this, CollegeAssigneeForIterator.class);
			pageContext.getOut().print(theCollegeAssigneeForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing College for assigneeFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing College for assigneeFor tag ");
		}
		return SKIP_BODY;
	}
}

