package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionValidInInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionValidInInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionValidInInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			geographical_regionValidInInverseIterator thegeographical_regionValidInInverseIterator = (geographical_regionValidInInverseIterator)findAncestorWithClass(this, geographical_regionValidInInverseIterator.class);
			pageContext.getOut().print(thegeographical_regionValidInInverseIterator.getValidInInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for validIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for validIn tag ");
		}
		return SKIP_BODY;
	}
}

