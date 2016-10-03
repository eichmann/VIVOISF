package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractOwnerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractOwnerType currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractOwnerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AbstractOwnerIterator theAbstractOwnerIterator = (AbstractOwnerIterator)findAncestorWithClass(this, AbstractOwnerIterator.class);
			pageContext.getOut().print(theAbstractOwnerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for owner tag ");
		}
		return SKIP_BODY;
	}
}

