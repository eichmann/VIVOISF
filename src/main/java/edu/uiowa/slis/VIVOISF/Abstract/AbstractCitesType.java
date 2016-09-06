package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractCitesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractCitesType currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractCitesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AbstractCitesIterator theAbstractCitesIterator = (AbstractCitesIterator)findAncestorWithClass(this, AbstractCitesIterator.class);
			pageContext.getOut().print(theAbstractCitesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for cites tag ");
		}
		return SKIP_BODY;
	}
}

