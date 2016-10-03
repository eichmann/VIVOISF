package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AbstractAsinIterator theAbstract = (AbstractAsinIterator)findAncestorWithClass(this, AbstractAsinIterator.class);
			pageContext.getOut().print(theAbstract.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for asin tag ");
		}
		return SKIP_BODY;
	}
}

