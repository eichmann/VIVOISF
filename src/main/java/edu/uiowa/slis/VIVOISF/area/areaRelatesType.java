package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaRelatesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaRelatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(areaRelatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			areaRelatesIterator theareaRelatesIterator = (areaRelatesIterator)findAncestorWithClass(this, areaRelatesIterator.class);
			pageContext.getOut().print(theareaRelatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing area for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for relates tag ");
		}
		return SKIP_BODY;
	}
}

