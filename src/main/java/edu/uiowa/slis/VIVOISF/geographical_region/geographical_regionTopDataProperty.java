package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionTopDataProperty extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionTopDataProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionTopDataProperty.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionTopDataPropertyIterator thegeographical_region = (geographical_regionTopDataPropertyIterator)findAncestorWithClass(this, geographical_regionTopDataPropertyIterator.class);
			pageContext.getOut().print(thegeographical_region.getTopDataProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for topDataProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for topDataProperty tag ");
		}
		return SKIP_BODY;
	}
}

