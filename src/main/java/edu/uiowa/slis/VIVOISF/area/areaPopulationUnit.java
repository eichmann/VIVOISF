package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaPopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaPopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(areaPopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaPopulationUnitIterator thearea = (areaPopulationUnitIterator)findAncestorWithClass(this, areaPopulationUnitIterator.class);
			pageContext.getOut().print(thearea.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing area for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

