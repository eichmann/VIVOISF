package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AbstractNumPagesIterator theAbstract = (AbstractNumPagesIterator)findAncestorWithClass(this, AbstractNumPagesIterator.class);
			pageContext.getOut().print(theAbstract.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for numPages tag ");
		}
		return SKIP_BODY;
	}
}

