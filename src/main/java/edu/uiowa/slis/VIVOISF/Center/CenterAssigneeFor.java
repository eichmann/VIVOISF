package edu.uiowa.slis.VIVOISF.Center;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CenterAssigneeFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CenterAssigneeFor currentInstance = null;
	private static final Log log = LogFactory.getLog(CenterAssigneeFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CenterAssigneeForIterator theCenterAssigneeForIterator = (CenterAssigneeForIterator)findAncestorWithClass(this, CenterAssigneeForIterator.class);
			pageContext.getOut().print(theCenterAssigneeForIterator.getAssigneeFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Center for assigneeFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Center for assigneeFor tag ");
		}
		return SKIP_BODY;
	}
}

