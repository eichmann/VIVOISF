package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractStatusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractStatusType currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractStatusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AbstractStatusIterator theAbstractStatusIterator = (AbstractStatusIterator)findAncestorWithClass(this, AbstractStatusIterator.class);
			pageContext.getOut().print(theAbstractStatusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for status tag ");
		}
		return SKIP_BODY;
	}
}

