package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionNameListFRIterator thegeographical_region = (geographical_regionNameListFRIterator)findAncestorWithClass(this, geographical_regionNameListFRIterator.class);
			pageContext.getOut().print(thegeographical_region.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

