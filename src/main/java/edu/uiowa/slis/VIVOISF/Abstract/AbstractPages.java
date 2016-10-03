package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractPages currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AbstractPagesIterator theAbstract = (AbstractPagesIterator)findAncestorWithClass(this, AbstractPagesIterator.class);
			pageContext.getOut().print(theAbstract.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for pages tag ");
		}
		return SKIP_BODY;
	}
}

