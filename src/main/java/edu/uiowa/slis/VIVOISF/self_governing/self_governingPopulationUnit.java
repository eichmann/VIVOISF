package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingPopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingPopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingPopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingPopulationUnitIterator theself_governing = (self_governingPopulationUnitIterator)findAncestorWithClass(this, self_governingPopulationUnitIterator.class);
			pageContext.getOut().print(theself_governing.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

