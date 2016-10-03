package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractPageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractPageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractPageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AbstractPageEndIterator theAbstract = (AbstractPageEndIterator)findAncestorWithClass(this, AbstractPageEndIterator.class);
			pageContext.getOut().print(theAbstract.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

