package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingPopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingPopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingPopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingPopulationTotalIterator theself_governing = (self_governingPopulationTotalIterator)findAncestorWithClass(this, self_governingPopulationTotalIterator.class);
			pageContext.getOut().print(theself_governing.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

