package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionBottomDataProperty extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionBottomDataProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionBottomDataProperty.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionBottomDataPropertyIterator thegeographical_region = (geographical_regionBottomDataPropertyIterator)findAncestorWithClass(this, geographical_regionBottomDataPropertyIterator.class);
			pageContext.getOut().print(thegeographical_region.getBottomDataProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for bottomDataProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for bottomDataProperty tag ");
		}
		return SKIP_BODY;
	}
}

