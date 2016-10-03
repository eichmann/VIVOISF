package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionTopObjectPropertyInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionTopObjectPropertyInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionTopObjectPropertyInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			geographical_regionTopObjectPropertyInverseIterator thegeographical_regionTopObjectPropertyInverseIterator = (geographical_regionTopObjectPropertyInverseIterator)findAncestorWithClass(this, geographical_regionTopObjectPropertyInverseIterator.class);
			pageContext.getOut().print(thegeographical_regionTopObjectPropertyInverseIterator.getTopObjectPropertyInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for topObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for topObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

