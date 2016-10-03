package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractPageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractPageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractPageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AbstractPageStartIterator theAbstract = (AbstractPageStartIterator)findAncestorWithClass(this, AbstractPageStartIterator.class);
			pageContext.getOut().print(theAbstract.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

