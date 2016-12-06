package edu.uiowa.slis.VIVOISF.non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class non_self_governingGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static non_self_governingGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(non_self_governingGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			non_self_governingGDPYearIterator thenon_self_governing = (non_self_governingGDPYearIterator)findAncestorWithClass(this, non_self_governingGDPYearIterator.class);
			pageContext.getOut().print(thenon_self_governing.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing non_self_governing for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing non_self_governing for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

