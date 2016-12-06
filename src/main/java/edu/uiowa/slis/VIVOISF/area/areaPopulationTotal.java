package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaPopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaPopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(areaPopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaPopulationTotalIterator thearea = (areaPopulationTotalIterator)findAncestorWithClass(this, areaPopulationTotalIterator.class);
			pageContext.getOut().print(thearea.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing area for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

