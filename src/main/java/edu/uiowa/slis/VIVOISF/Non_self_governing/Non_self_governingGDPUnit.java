package edu.uiowa.slis.VIVOISF.Non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Non_self_governingGDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Non_self_governingGDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(Non_self_governingGDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Non_self_governingGDPUnitIterator theNon_self_governing = (Non_self_governingGDPUnitIterator)findAncestorWithClass(this, Non_self_governingGDPUnitIterator.class);
			pageContext.getOut().print(theNon_self_governing.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Non_self_governing for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Non_self_governing for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}

