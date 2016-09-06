package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingHDIYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingHDIYear currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingHDIYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingHDIYearIterator theself_governing = (self_governingHDIYearIterator)findAncestorWithClass(this, self_governingHDIYearIterator.class);
			pageContext.getOut().print(theself_governing.getHDIYear());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for HDIYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for HDIYear tag ");
		}
		return SKIP_BODY;
	}
}

