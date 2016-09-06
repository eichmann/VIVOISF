package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractReproduces extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractReproduces currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractReproduces.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AbstractReproducesIterator theAbstractReproducesIterator = (AbstractReproducesIterator)findAncestorWithClass(this, AbstractReproducesIterator.class);
			pageContext.getOut().print(theAbstractReproducesIterator.getReproduces());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

