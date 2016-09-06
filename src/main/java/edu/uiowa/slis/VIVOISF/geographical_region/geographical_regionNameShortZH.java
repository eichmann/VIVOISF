package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionNameShortZHIterator thegeographical_region = (geographical_regionNameShortZHIterator)findAncestorWithClass(this, geographical_regionNameShortZHIterator.class);
			pageContext.getOut().print(thegeographical_region.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

