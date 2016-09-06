package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingPopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingPopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingPopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingPopulationYearIterator theself_governing = (self_governingPopulationYearIterator)findAncestorWithClass(this, self_governingPopulationYearIterator.class);
			pageContext.getOut().print(theself_governing.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

