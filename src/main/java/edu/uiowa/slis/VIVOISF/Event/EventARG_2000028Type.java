package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventARG_2000028Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventARG_2000028Type currentInstance = null;
	private static final Log log = LogFactory.getLog(EventARG_2000028Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EventARG_2000028Iterator theEventARG_2000028Iterator = (EventARG_2000028Iterator)findAncestorWithClass(this, EventARG_2000028Iterator.class);
			pageContext.getOut().print(theEventARG_2000028Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

