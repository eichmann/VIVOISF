package edu.uiowa.slis.VIVOISF.Center;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CenterAssigneeForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CenterAssigneeForType currentInstance = null;
	private static final Log log = LogFactory.getLog(CenterAssigneeForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CenterAssigneeForIterator theCenterAssigneeForIterator = (CenterAssigneeForIterator)findAncestorWithClass(this, CenterAssigneeForIterator.class);
			pageContext.getOut().print(theCenterAssigneeForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Center for assigneeFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Center for assigneeFor tag ");
		}
		return SKIP_BODY;
	}
}

