package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AbstractUpcIterator theAbstract = (AbstractUpcIterator)findAncestorWithClass(this, AbstractUpcIterator.class);
			pageContext.getOut().print(theAbstract.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for upc tag ");
		}
		return SKIP_BODY;
	}
}

