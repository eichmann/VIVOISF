package edu.uiowa.slis.VIVOISF.Name;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NameHasURLType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NameHasURLType currentInstance = null;
	private static final Log log = LogFactory.getLog(NameHasURLType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NameHasURLIterator theNameHasURLIterator = (NameHasURLIterator)findAncestorWithClass(this, NameHasURLIterator.class);
			pageContext.getOut().print(theNameHasURLIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Name for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Name for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

