package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionNameShortARIterator thegeographical_region = (geographical_regionNameShortARIterator)findAncestorWithClass(this, geographical_regionNameShortARIterator.class);
			pageContext.getOut().print(thegeographical_region.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

