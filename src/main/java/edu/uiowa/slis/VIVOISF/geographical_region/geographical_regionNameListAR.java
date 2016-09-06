package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionNameListARIterator thegeographical_region = (geographical_regionNameListARIterator)findAncestorWithClass(this, geographical_regionNameListARIterator.class);
			pageContext.getOut().print(thegeographical_region.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

