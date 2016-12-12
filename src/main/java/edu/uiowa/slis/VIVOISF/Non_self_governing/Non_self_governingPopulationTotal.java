package edu.uiowa.slis.VIVOISF.Non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Non_self_governingPopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Non_self_governingPopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(Non_self_governingPopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Non_self_governingPopulationTotalIterator theNon_self_governing = (Non_self_governingPopulationTotalIterator)findAncestorWithClass(this, Non_self_governingPopulationTotalIterator.class);
			pageContext.getOut().print(theNon_self_governing.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Non_self_governing for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Non_self_governing for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

