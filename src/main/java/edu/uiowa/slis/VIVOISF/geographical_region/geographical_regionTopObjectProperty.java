package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionTopObjectProperty extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionTopObjectProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionTopObjectProperty.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			geographical_regionTopObjectPropertyIterator thegeographical_regionTopObjectPropertyIterator = (geographical_regionTopObjectPropertyIterator)findAncestorWithClass(this, geographical_regionTopObjectPropertyIterator.class);
			pageContext.getOut().print(thegeographical_regionTopObjectPropertyIterator.getTopObjectProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for topObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for topObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

