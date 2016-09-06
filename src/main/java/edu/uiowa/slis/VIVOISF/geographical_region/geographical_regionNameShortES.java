package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionNameShortESIterator thegeographical_region = (geographical_regionNameShortESIterator)findAncestorWithClass(this, geographical_regionNameShortESIterator.class);
			pageContext.getOut().print(thegeographical_region.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

