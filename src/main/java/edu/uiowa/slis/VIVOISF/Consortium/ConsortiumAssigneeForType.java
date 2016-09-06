package edu.uiowa.slis.VIVOISF.Consortium;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConsortiumAssigneeForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConsortiumAssigneeForType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConsortiumAssigneeForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConsortiumAssigneeForIterator theConsortiumAssigneeForIterator = (ConsortiumAssigneeForIterator)findAncestorWithClass(this, ConsortiumAssigneeForIterator.class);
			pageContext.getOut().print(theConsortiumAssigneeForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Consortium for assigneeFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Consortium for assigneeFor tag ");
		}
		return SKIP_BODY;
	}
}

