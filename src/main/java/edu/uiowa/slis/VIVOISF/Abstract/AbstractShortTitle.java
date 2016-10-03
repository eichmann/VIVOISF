package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AbstractShortTitleIterator theAbstract = (AbstractShortTitleIterator)findAncestorWithClass(this, AbstractShortTitleIterator.class);
			pageContext.getOut().print(theAbstract.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

