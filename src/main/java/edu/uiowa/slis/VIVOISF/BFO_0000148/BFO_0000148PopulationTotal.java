package edu.uiowa.slis.VIVOISF.BFO_0000148;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000148PopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000148PopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000148PopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000148PopulationTotalIterator theBFO_0000148 = (BFO_0000148PopulationTotalIterator)findAncestorWithClass(this, BFO_0000148PopulationTotalIterator.class);
			pageContext.getOut().print(theBFO_0000148.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000148 for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000148 for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

