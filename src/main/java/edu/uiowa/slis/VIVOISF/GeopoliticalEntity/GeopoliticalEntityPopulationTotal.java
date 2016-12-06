package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityPopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityPopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityPopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityPopulationTotalIterator theGeopoliticalEntity = (GeopoliticalEntityPopulationTotalIterator)findAncestorWithClass(this, GeopoliticalEntityPopulationTotalIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

