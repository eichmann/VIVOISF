package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionSameAsInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionSameAsInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionSameAsInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			geographical_regionSameAsInverseIterator thegeographical_regionSameAsInverseIterator = (geographical_regionSameAsInverseIterator)findAncestorWithClass(this, geographical_regionSameAsInverseIterator.class);
			pageContext.getOut().print(thegeographical_regionSameAsInverseIterator.getSameAsInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for sameAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for sameAs tag ");
		}
		return SKIP_BODY;
	}
}

