package edu.uiowa.slis.VIVOISF.non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class non_self_governingPopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static non_self_governingPopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(non_self_governingPopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			non_self_governingPopulationTotalIterator thenon_self_governing = (non_self_governingPopulationTotalIterator)findAncestorWithClass(this, non_self_governingPopulationTotalIterator.class);
			pageContext.getOut().print(thenon_self_governing.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing non_self_governing for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing non_self_governing for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

