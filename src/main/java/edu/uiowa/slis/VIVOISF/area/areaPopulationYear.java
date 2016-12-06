package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaPopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaPopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(areaPopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaPopulationYearIterator thearea = (areaPopulationYearIterator)findAncestorWithClass(this, areaPopulationYearIterator.class);
			pageContext.getOut().print(thearea.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing area for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

