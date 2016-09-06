package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractStatus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractStatus currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractStatus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AbstractStatusIterator theAbstractStatusIterator = (AbstractStatusIterator)findAncestorWithClass(this, AbstractStatusIterator.class);
			pageContext.getOut().print(theAbstractStatusIterator.getStatus());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for status tag ");
		}
		return SKIP_BODY;
	}
}

