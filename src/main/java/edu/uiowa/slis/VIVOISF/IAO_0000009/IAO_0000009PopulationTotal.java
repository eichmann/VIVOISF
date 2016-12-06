package edu.uiowa.slis.VIVOISF.IAO_0000009;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000009PopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000009PopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000009PopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000009PopulationTotalIterator theIAO_0000009 = (IAO_0000009PopulationTotalIterator)findAncestorWithClass(this, IAO_0000009PopulationTotalIterator.class);
			pageContext.getOut().print(theIAO_0000009.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000009 for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000009 for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}
