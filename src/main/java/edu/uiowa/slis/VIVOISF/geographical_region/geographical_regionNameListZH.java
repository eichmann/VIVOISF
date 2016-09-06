package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionNameListZHIterator thegeographical_region = (geographical_regionNameListZHIterator)findAncestorWithClass(this, geographical_regionNameListZHIterator.class);
			pageContext.getOut().print(thegeographical_region.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

