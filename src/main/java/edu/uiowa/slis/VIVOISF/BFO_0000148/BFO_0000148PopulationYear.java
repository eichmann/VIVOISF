package edu.uiowa.slis.VIVOISF.BFO_0000148;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000148PopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000148PopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000148PopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000148PopulationYearIterator theBFO_0000148 = (BFO_0000148PopulationYearIterator)findAncestorWithClass(this, BFO_0000148PopulationYearIterator.class);
			pageContext.getOut().print(theBFO_0000148.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000148 for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000148 for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

