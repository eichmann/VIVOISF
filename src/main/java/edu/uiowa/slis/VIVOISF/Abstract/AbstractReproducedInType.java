package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractReproducedInType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractReproducedInType currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractReproducedInType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AbstractReproducedInIterator theAbstractReproducedInIterator = (AbstractReproducedInIterator)findAncestorWithClass(this, AbstractReproducedInIterator.class);
			pageContext.getOut().print(theAbstractReproducedInIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

