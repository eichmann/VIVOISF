package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionHasCode extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionHasCode currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionHasCode.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionHasCodeIterator thegeographical_region = (geographical_regionHasCodeIterator)findAncestorWithClass(this, geographical_regionHasCodeIterator.class);
			pageContext.getOut().print(thegeographical_region.getHasCode());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for hasCode tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for hasCode tag ");
		}
		return SKIP_BODY;
	}
}

