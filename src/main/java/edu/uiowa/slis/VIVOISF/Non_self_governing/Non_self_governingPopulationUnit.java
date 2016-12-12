package edu.uiowa.slis.VIVOISF.Non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Non_self_governingPopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Non_self_governingPopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(Non_self_governingPopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Non_self_governingPopulationUnitIterator theNon_self_governing = (Non_self_governingPopulationUnitIterator)findAncestorWithClass(this, Non_self_governingPopulationUnitIterator.class);
			pageContext.getOut().print(theNon_self_governing.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Non_self_governing for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Non_self_governing for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

