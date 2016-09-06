package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionNameListESIterator thegeographical_region = (geographical_regionNameListESIterator)findAncestorWithClass(this, geographical_regionNameListESIterator.class);
			pageContext.getOut().print(thegeographical_region.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

