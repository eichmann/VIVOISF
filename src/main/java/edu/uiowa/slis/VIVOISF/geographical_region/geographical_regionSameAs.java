package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionSameAs extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionSameAs currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionSameAs.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionSameAsIterator thegeographical_region = (geographical_regionSameAsIterator)findAncestorWithClass(this, geographical_regionSameAsIterator.class);
			pageContext.getOut().print(thegeographical_region.getSameAs());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for sameAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for sameAs tag ");
		}
		return SKIP_BODY;
	}
}

