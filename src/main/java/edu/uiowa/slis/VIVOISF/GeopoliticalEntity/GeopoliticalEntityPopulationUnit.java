package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityPopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityPopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityPopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityPopulationUnitIterator theGeopoliticalEntity = (GeopoliticalEntityPopulationUnitIterator)findAncestorWithClass(this, GeopoliticalEntityPopulationUnitIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

