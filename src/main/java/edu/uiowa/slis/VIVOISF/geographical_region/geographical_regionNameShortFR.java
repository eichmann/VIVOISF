package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionNameShortFRIterator thegeographical_region = (geographical_regionNameShortFRIterator)findAncestorWithClass(this, geographical_regionNameShortFRIterator.class);
			pageContext.getOut().print(thegeographical_region.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

