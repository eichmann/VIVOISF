package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionHasTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionHasTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionHasTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			economic_regionHasTitleIterator theeconomic_regionHasTitleIterator = (economic_regionHasTitleIterator)findAncestorWithClass(this, economic_regionHasTitleIterator.class);
			pageContext.getOut().print(theeconomic_regionHasTitleIterator.getHasTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

