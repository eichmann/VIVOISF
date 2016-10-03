package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AbstractNumberIterator theAbstract = (AbstractNumberIterator)findAncestorWithClass(this, AbstractNumberIterator.class);
			pageContext.getOut().print(theAbstract.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for number tag ");
		}
		return SKIP_BODY;
	}
}

