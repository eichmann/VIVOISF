package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AbstractHandleIterator theAbstract = (AbstractHandleIterator)findAncestorWithClass(this, AbstractHandleIterator.class);
			pageContext.getOut().print(theAbstract.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for handle tag ");
		}
		return SKIP_BODY;
	}
}

