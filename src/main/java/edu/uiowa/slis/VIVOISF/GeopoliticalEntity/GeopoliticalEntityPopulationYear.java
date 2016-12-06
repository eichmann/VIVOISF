package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityPopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityPopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityPopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityPopulationYearIterator theGeopoliticalEntity = (GeopoliticalEntityPopulationYearIterator)findAncestorWithClass(this, GeopoliticalEntityPopulationYearIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

