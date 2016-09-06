package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractCitedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractCitedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractCitedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AbstractCitedByIterator theAbstractCitedByIterator = (AbstractCitedByIterator)findAncestorWithClass(this, AbstractCitedByIterator.class);
			pageContext.getOut().print(theAbstractCitedByIterator.getCitedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

