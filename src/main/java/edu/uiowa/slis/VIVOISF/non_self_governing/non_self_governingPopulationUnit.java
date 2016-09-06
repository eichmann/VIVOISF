package edu.uiowa.slis.VIVOISF.non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class non_self_governingPopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static non_self_governingPopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(non_self_governingPopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			non_self_governingPopulationUnitIterator thenon_self_governing = (non_self_governingPopulationUnitIterator)findAncestorWithClass(this, non_self_governingPopulationUnitIterator.class);
			pageContext.getOut().print(thenon_self_governing.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing non_self_governing for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing non_self_governing for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

