package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractUri currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AbstractUriIterator theAbstract = (AbstractUriIterator)findAncestorWithClass(this, AbstractUriIterator.class);
			pageContext.getOut().print(theAbstract.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for uri tag ");
		}
		return SKIP_BODY;
	}
}

