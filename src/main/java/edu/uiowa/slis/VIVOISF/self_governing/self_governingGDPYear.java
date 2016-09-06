package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingGDPYearIterator theself_governing = (self_governingGDPYearIterator)findAncestorWithClass(this, self_governingGDPYearIterator.class);
			pageContext.getOut().print(theself_governing.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

