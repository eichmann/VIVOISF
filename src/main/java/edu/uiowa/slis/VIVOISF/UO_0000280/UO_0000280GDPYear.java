package edu.uiowa.slis.VIVOISF.UO_0000280;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UO_0000280GDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UO_0000280GDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(UO_0000280GDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			UO_0000280GDPYearIterator theUO_0000280 = (UO_0000280GDPYearIterator)findAncestorWithClass(this, UO_0000280GDPYearIterator.class);
			pageContext.getOut().print(theUO_0000280.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing UO_0000280 for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing UO_0000280 for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

