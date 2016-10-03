package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AbstractCodenIterator theAbstract = (AbstractCodenIterator)findAncestorWithClass(this, AbstractCodenIterator.class);
			pageContext.getOut().print(theAbstract.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for coden tag ");
		}
		return SKIP_BODY;
	}
}

