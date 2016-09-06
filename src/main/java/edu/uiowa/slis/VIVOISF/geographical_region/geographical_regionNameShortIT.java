package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionNameShortITIterator thegeographical_region = (geographical_regionNameShortITIterator)findAncestorWithClass(this, geographical_regionNameShortITIterator.class);
			pageContext.getOut().print(thegeographical_region.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

