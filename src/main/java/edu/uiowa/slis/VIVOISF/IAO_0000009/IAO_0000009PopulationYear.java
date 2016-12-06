package edu.uiowa.slis.VIVOISF.IAO_0000009;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000009PopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000009PopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000009PopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000009PopulationYearIterator theIAO_0000009 = (IAO_0000009PopulationYearIterator)findAncestorWithClass(this, IAO_0000009PopulationYearIterator.class);
			pageContext.getOut().print(theIAO_0000009.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000009 for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000009 for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

