package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionBottomObjectPropertyType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionBottomObjectPropertyType currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionBottomObjectPropertyType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			geographical_regionBottomObjectPropertyIterator thegeographical_regionBottomObjectPropertyIterator = (geographical_regionBottomObjectPropertyIterator)findAncestorWithClass(this, geographical_regionBottomObjectPropertyIterator.class);
			pageContext.getOut().print(thegeographical_regionBottomObjectPropertyIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for bottomObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for bottomObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

