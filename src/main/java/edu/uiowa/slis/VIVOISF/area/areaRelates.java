package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaRelates extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaRelates currentInstance = null;
	private static final Log log = LogFactory.getLog(areaRelates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			areaRelatesIterator theareaRelatesIterator = (areaRelatesIterator)findAncestorWithClass(this, areaRelatesIterator.class);
			pageContext.getOut().print(theareaRelatesIterator.getRelates());
		} catch (Exception e) {
			log.error("Can't find enclosing area for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for relates tag ");
		}
		return SKIP_BODY;
	}
}

