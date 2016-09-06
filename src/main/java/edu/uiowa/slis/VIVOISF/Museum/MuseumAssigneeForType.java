package edu.uiowa.slis.VIVOISF.Museum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MuseumAssigneeForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MuseumAssigneeForType currentInstance = null;
	private static final Log log = LogFactory.getLog(MuseumAssigneeForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MuseumAssigneeForIterator theMuseumAssigneeForIterator = (MuseumAssigneeForIterator)findAncestorWithClass(this, MuseumAssigneeForIterator.class);
			pageContext.getOut().print(theMuseumAssigneeForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Museum for assigneeFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for assigneeFor tag ");
		}
		return SKIP_BODY;
	}
}

