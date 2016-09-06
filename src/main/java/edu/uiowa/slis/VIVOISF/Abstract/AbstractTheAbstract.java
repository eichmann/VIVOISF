package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AbstractTheAbstractIterator theAbstract = (AbstractTheAbstractIterator)findAncestorWithClass(this, AbstractTheAbstractIterator.class);
			pageContext.getOut().print(theAbstract.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

