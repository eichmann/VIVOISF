package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionHasTitleType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionHasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionHasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			geographical_regionHasTitleIterator thegeographical_regionHasTitleIterator = (geographical_regionHasTitleIterator)findAncestorWithClass(this, geographical_regionHasTitleIterator.class);
			pageContext.getOut().print(thegeographical_regionHasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

