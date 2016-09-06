package edu.uiowa.slis.VIVOISF.non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class non_self_governingAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static non_self_governingAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(non_self_governingAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			non_self_governingAgriculturalAreaYearIterator thenon_self_governing = (non_self_governingAgriculturalAreaYearIterator)findAncestorWithClass(this, non_self_governingAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(thenon_self_governing.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing non_self_governing for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing non_self_governing for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

